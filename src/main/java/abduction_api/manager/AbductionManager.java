package abduction_api.manager;

import abduction_api.abducibles.AbducibleContainer;
import abduction_api.exception.*;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

public interface AbductionManager {

    void setKnowledgeBase(OWLOntology knowledgeBase);

    OWLOntology getKnowledgeBase();

    void setObservation(OWLAxiom observation) throws MultiObservationException, InvalidObservationException;

    OWLAxiom getObservation() throws MultiObservationException;

    default void setTimeout(double seconds){
        throw new NotSupportedException("setting timeout");
    }

    default double getTimeout(){
        throw new NotSupportedException("setting timeout");
    }

    void setAdditionalSolverSettings(String internalSettings);

    void solveAbduction();

    Set<ExplanationWrapper> getExplanations();

    String getOutputMessage();

    String getFullLog();

    void setAbducibles(AbducibleContainer abducibleContainer);

    AbducibleContainer getAbducibles();

}
