package abduction_api.manager;

import abduction_api.monitors.AbductionMonitor;
import abduction_api.monitors.Percentage;

public interface ThreadAbductionManager extends AbductionManager, Runnable {

    AbductionMonitor getAbductionMonitor();

    default void sendExplanation(AbductionMonitor monitor, ExplanationWrapper explanation) throws InterruptedException {
        monitor.addNewExplanation(explanation);
        monitor.notifyAll();
        monitor.wait();
    }

    default void updateProgress(AbductionMonitor monitor, Percentage progress, String status)
            throws InterruptedException {
        monitor.setProgress(progress);
        monitor.setStatusMessage(status);
        monitor.notifyAll();
        monitor.wait();
    }

}
