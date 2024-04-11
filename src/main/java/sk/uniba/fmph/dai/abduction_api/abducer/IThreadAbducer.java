package sk.uniba.fmph.dai.abduction_api.abducer;

import sk.uniba.fmph.dai.abduction_api.exception.CommonException;
import sk.uniba.fmph.dai.abduction_api.monitor.AbductionMonitor;
import sk.uniba.fmph.dai.abduction_api.monitor.Percentage;

/**
 * Interface for an abduction solver that can run in a separate thread and output explanations and other data on-the-fly.
 */
public interface IThreadAbducer extends IAbducer, Runnable {

    /**
     * Gets the monitor used to synchronise the threads and store the outputted data.
     *
     * @return the monitor
     */
    AbductionMonitor getAbductionMonitor();

    /**
     * Sends a newly found explanation from the solver to other threads through the monitor.
     *
     * @param explanation the explanation
     * @throws InterruptedException if the thread has been interrupted
     */
    default void sendExplanation(IExplanation explanation) throws InterruptedException {
        AbductionMonitor monitor = getAbductionMonitor();
        if (monitor == null)
            throw new CommonException("Abduction monitor is not initialised!");
        monitor.addNewExplanation(explanation);
        monitor.notifyAll();
        monitor.wait(monitor.getWaitLimit());
    }

    /**
     * Sends an update describing the current progress of the abduction solving process
     * from the solver to other threads through the monitor.
     *
     * @param progress How many % of the process are finished.
     * @param status   A status messge describing the current state.
     * @throws InterruptedException if the thread has been interrupted
     */
    default void updateProgress(Percentage progress, String status) throws InterruptedException {
        AbductionMonitor monitor = getAbductionMonitor();

        if (monitor == null)
            throw new CommonException("Abduction monitor is not initialised!");

        if (progress != null)
            monitor.setProgressPercentage(progress);

        if (status != null)
            monitor.setStatusMessage(status);

        monitor.notifyAll();
        monitor.wait(monitor.getWaitLimit());
    }

    /**
     * Sends an update describing the current progress of the abduction solving process
     * from the solver to other threads through the monitor.
     *
     * @param progress How many % of the process are finished.
     * @throws InterruptedException if the thread has been interrupted
     */
    default void updateProgress(Percentage progress) throws InterruptedException {
        updateProgress(progress, null);
    }

    /**
     * Sends an update describing the current progress of the abduction solving process
     * from the solver to other threads through the monitor.
     *
     * @param status A status messge describing the current state.
     * @throws InterruptedException if the thread has been interrupted
     */
    default void updateProgress(String status) throws InterruptedException {
        updateProgress(null, status);
    }

}
