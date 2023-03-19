package abductionapi.manager;

import abductionapi.abducibles.AbducibleContainer;
import abductionapi.exception.*;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

/**
 * AbductionManager generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 */
public interface AbductionManager {

    /**
     * Sets the background knowledge for an abduction.
     */
    void setKnowledgeBase(OWLOntology knowledgeBase);

    /**
     * Returns background knowledge.
     * @return OWLOntology
     */
    OWLOntology getKnowledgeBase();

    /**
     * Sets observation for abduction.
     * @param observation observation for abduction.
     * @throws MultiObservationException if solver does not support multi observation.
     * @throws InvalidObservationException if solver does not support this type of observation axiom.
     */
    void setObservation(OWLAxiom observation) throws MultiObservationException, InvalidObservationException;

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
     * Returns solver internal info (debug, timeout, depth, etc.).
     * @return a string with solver internal info.
     */
    String getOutputAdditionalInfo();

    /**
     * Sets abducibles for abduction
     * @param abducibleContainer to be set to abductionManager.
     */
    void setAbducibles(AbducibleContainer abducibleContainer);

    /**
     * Returns abducible container.
     * @return AbducibleContainer with abducibles for the abduction.
     */
    AbducibleContainer getAbducibles();

}
