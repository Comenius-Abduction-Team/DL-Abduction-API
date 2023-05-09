package abduction_api.manager;

import abduction_api.abducibles.AbducibleContainer;
import abduction_api.exception.*;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

public interface AbductionManager {

    void setBackgroundKnowledge(OWLOntology backgroundKnowledge);

    OWLOntology getBackgroundKnowledge();

    void setObservation(OWLAxiom observation) throws MultiObservationException, InvalidObservationException;

    OWLAxiom getObservation() throws MultiObservationException;

    default void setTimeout(double seconds) throws NotSupportedException {
        throw new NotSupportedException("setting timeout");
    }

    default double getTimeout() throws NotSupportedException {
        throw new NotSupportedException("setting timeout");
    }

    default void setSolverSpecificParameters(String parameters) throws NotSupportedException, InvalidSolverParameterException {
        throw new NotSupportedException("setting string parameters");
    }

    default void resetSolverSpecificParameters() throws NotSupportedException {
        throw new NotSupportedException("setting string parameters");
    }

    void solveAbduction();

    Set<ExplanationWrapper> getExplanations();

    default String getOutputMessage(){ return ""; }

    default String getFullLog(){ return ""; }

    void setAbducibleContainer(AbducibleContainer abducibleContainer);

    AbducibleContainer getAbducibleContainer();

}
