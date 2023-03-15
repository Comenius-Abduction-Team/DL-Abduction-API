package abductionapi.manager;

import abductionapi.abducibles.AbducibleContainer;
import abductionapi.exception.InvalidObservationException;
import abductionapi.exception.MultiObservationException;
import abductionapi.exception.NotSupportedException;
import abductionapi.monitors.ExplanationMonitor;
import abductionapi.monitors.ProgressMonitor;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

/**
 * AbductionManager generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 */
public interface ThreadAbductionManager<ABDUCIBLE_CONTAINER extends AbducibleContainer> extends Runnable {

    /**
     * Thread version method to get explanations.
     */
    default void getExplanationsIncrementally() {
        throw new NotSupportedException("multithread explanations");
    }

    /**
     * Returns monitor.
     * @return a instance of Monitor.
     */
    ExplanationMonitor getExplanationMonitor();

    ProgressMonitor getProgressMonitor();

    /**
     * Method adds explanation to Monitor.explanations and a notification to monitor is sent.
     * @param explanation a new computed explanation.
     */
    default void sendExplanation(ExplanationMonitor monitor, ExplanationWrapper explanation) {
        monitor.addNewExplanation(explanation);
        monitor.notifyAll();
        try {
            monitor.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method adds explanation to Monitor.explanations and a notification to monitor is sent.
     */
    default void updateProgress(ProgressMonitor monitor, double progress, String status) {
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
