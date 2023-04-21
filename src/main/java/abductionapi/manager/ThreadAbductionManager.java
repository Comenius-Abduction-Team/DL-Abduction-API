package abductionapi.manager;

import abductionapi.exception.NotSupportedException;
import abductionapi.monitors.AbductionMonitor;

public interface ThreadAbductionManager extends Runnable {


    default void getExplanationsAsynchronously() {
        throw new NotSupportedException("multithread explanations");
    }

    AbductionMonitor getAbductionMonitor();

    default void sendExplanation(AbductionMonitor monitor, ExplanationWrapper explanation) {
        monitor.addNewExplanation(explanation);
        monitor.notifyAll();
        try {
            monitor.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    default void updateProgress(AbductionMonitor monitor, double progress, String status) {
        monitor.setProgress(progress);
        monitor.setStatusMessage(status);
        monitor.notifyAll();
        try {
            monitor.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
