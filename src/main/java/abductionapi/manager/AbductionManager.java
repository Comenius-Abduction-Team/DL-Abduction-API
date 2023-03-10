package abductionapi.manager;

import abductionapi.abducibles.AbducibleContainer;
import abductionapi.exception.*;
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
public interface AbductionManager<ABDUCIBLE_CONTAINER extends AbducibleContainer> extends Runnable {

    /**
     * Sets the background knowledge for an abduction.
     */
    void setBackgroundKnowledge(OWLOntology backgroundKnowledge);

    /**
     * Returns background knowledge.
     * @return OWLOntology
     */
    OWLOntology getBackgroundKnowledge();

    /**
     * Sets observation for abduction.
     * @param observation observation for abduction.
     * @throws MultiObservationException if solver does not support multi observation.
     * @throws AxiomObservationException if solver does not support this type of observation axiom.
     */
    void setObservation(OWLAxiom observation) throws MultiObservationException, AxiomObservationException;

    /**
     * Returns observation.
     * @return <OBSERVATION_TYPE> observation.
     */
    OWLAxiom getObservation() throws MultiObservationException;

    default void setTimeout(double seconds){
        throw new NotSupportedException("setting timeout");
    }

    default double getTimeout(){
        throw new NotSupportedException("setting timeout");
    }

    /**
     * Sets a solver internal info (debug, timeout, depth, etc.).
     * @param internalSettings solver internal info (debug, timeout, depth, etc.).
     */
    void setAdditionalSolverSettings(String internalSettings);

    /**
     * Returns abduction explanations.
     * @return Set of explanations.
     */
    Set<ExplanationWrapper> getExplanations();

    /**
     * Thread version method to get explanations.
     */
    default void getExplanationsIncrementally() {
        throw new NotSupportedException("multithread explanations");
    }

    /**
     * Returns solver internal info (debug, timeout, depth, etc.).
     * @return a string with solver internal info.
     */
    String getOutputAdditionalInfo();


    /**
     * Sets abducibles for abduction
     * @param abducibleContainer to be set to abductionManager.
     */
    void setAbducibles(ABDUCIBLE_CONTAINER abducibleContainer);

    /**
     * Returns abducible container.
     * @return AbducibleContainer with abducibles for the abduction.
     */
    ABDUCIBLE_CONTAINER getAbducibles();

    @Override
    default void run() {
        throw new NotSupportedException("multi-thread mode");
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
