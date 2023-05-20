package abduction_api.manager;

import abduction_api.exception.CommonException;
import abduction_api.monitor.AbductionMonitor;
import abduction_api.monitor.Percentage;

public interface ThreadAbductionManager extends AbductionManager, Runnable {

    AbductionMonitor getAbductionMonitor();

    default void sendExplanation(ExplanationWrapper explanation) throws InterruptedException {
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
