package sk.uniba.fmph.dai.abduction_api.abducer;

import sk.uniba.fmph.dai.abduction_api.exception.CommonException;
import sk.uniba.fmph.dai.abduction_api.monitor.AbductionMonitor;
import sk.uniba.fmph.dai.abduction_api.monitor.Percentage;

public interface IThreadAbducer extends IAbducer, Runnable {

    AbductionMonitor getAbductionMonitor();

    default void sendExplanation(IExplanation explanation) throws InterruptedException {
        AbductionMonitor monitor = getAbductionMonitor();
        if (monitor == null)
            throw new CommonException("Abduction monitor is not initialised!");
        monitor.addNewExplanation(explanation);
        monitor.notifyAll();
        monitor.wait(monitor.getWaitLimit());
    }

    default void updateProgress(Percentage progress, String status) throws InterruptedException {
        AbductionMonitor monitor = getAbductionMonitor();

        if (monitor == null)
            throw new CommonException("Abduction monitor is not initialised!");

        if (progress != null)
            monitor.setProgress(progress);

        if (status != null)
            monitor.setStatusMessage(status);

        monitor.notifyAll();
        monitor.wait(monitor.getWaitLimit());
    }

    default void updateProgress(Percentage progress) throws InterruptedException {
        updateProgress(progress, null);
    }

    default void updateProgress(String status) throws InterruptedException {
        AbductionMonitor monitor = getAbductionMonitor();
        updateProgress(null, status);
    }

}
