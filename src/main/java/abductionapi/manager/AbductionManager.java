package abductionapi.manager;

import abductionapi.abducibles.AbducibleContainer;
import abductionapi.exception.*;
import abductionapi.monitors.ExplanationMonitor;
import abductionapi.monitors.ProgressMonitor;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * AbductionManager generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 */
public interface AbductionManager<ABDUCIBLE_CONTAINER extends AbducibleContainer> extends Runnable {

    ExplanationMonitor explanationMonitor = new ExplanationMonitor();
    ProgressMonitor progressMonitor = new ProgressMonitor();

    /**
     * Sets the background knowledge for an abduction.
     */
    public void setBackgroundKnowledge(OWLOntology backgroundKnowledge);

    /**
     * Returns background knowledge.
     * @return OWLOntology
     */
    public OWLOntology getBackgroundKnowledge();

    /**
     * Sets observation for abduction.
     * @param observation observation for abduction.
     * @throws MultiObservationException if solver does not support multi observation.
     * @throws AxiomObservationException if solver does not support this type of observation axiom.
     */
    public void setObservation(OWLAxiom observation) throws MultiObservationException, AxiomObservationException;

    /**
     * Returns observation.
     * @return <OBSERVATION_TYPE> observation.
     */
    public OWLAxiom getObservation() throws MultiObservationException;

    default public void setTimeout(double seconds){
        throw new NotSupportedException("setting timeout");
    }

    default public double getTimeout(){
        throw new NotSupportedException("setting timeout");
    }

    /**
     * Sets a solver internal info (debug, timeout, depth, etc.).
     * @param internalSettings solver internal info (debug, timeout, depth, etc.).
     */
    public void setAdditionalSolverSettings(String internalSettings);

    /**
     * Returns abduction explanations.
     * @return Set of explanations.
     */
    public ExplanationWrapper getExplanations();

    /**
     * Thread version method to get explanations.
     */
    default public void getExplanationsIncrementally() {
        throw new NotSupportedException("multithread explanations");
    }

    /**
     * Returns solver internal info (debug, timeout, depth, etc.).
     * @return a string with solver internal info.
     */
    public String getOutputAdditionalInfo();


    /**
     * Sets abducibles for abduction
     * @param abducibleContainer to be set to abductionManager.
     */
    public void setAbducibles(ABDUCIBLE_CONTAINER abducibleContainer);

    /**
     * Returns abducible container.
     * @return AbducibleContainer with abducibles for the abduction.
     */
    public ABDUCIBLE_CONTAINER getAbducibles();

    @Override
    default void run() {
        throw new ThreadVersionException();
    }

    /**
     * Returns monitor.
     * @return a instance of Monitor.
     */
    default ExplanationMonitor getExplanationMonitor() {
        return explanationMonitor;
    }

    default ProgressMonitor getProgressMonitor() {
        return progressMonitor;
    }

    /**
     * Method adds explanation to Monitor.explanations and a notification to monitor is sent.
     * @param explanation a new computed explanation.
     */
    default void sendExplanation(ExplanationWrapper explanation) {
        explanationMonitor.addNewExplanation(explanation);
        explanationMonitor.notifyAll();
        try {
            explanationMonitor.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method adds explanation to Monitor.explanations and a notification to monitor is sent.
     */
    default void updateProgress(double progress, String status) {
        progressMonitor.setProgress(progress);
        progressMonitor.setStatusMessage(status);
        progressMonitor.notifyAll();
        try {
            progressMonitor.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
