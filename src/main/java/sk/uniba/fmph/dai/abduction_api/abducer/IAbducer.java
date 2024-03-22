package sk.uniba.fmph.dai.abduction_api.abducer;

import sk.uniba.fmph.dai.abduction_api.abducible.IAbducibles;
import sk.uniba.fmph.dai.abduction_api.abducible.IExplanationConfigurator;
import sk.uniba.fmph.dai.abduction_api.exception.*;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

public interface IAbducer {

    void setBackgroundKnowledge(OWLOntology backgroundKnowledge);

    OWLOntology getBackgroundKnowledge();

    void setObservation(OWLAxiom observation) throws InvalidObservationException;

    void setObservation(Set<OWLAxiom> observation) throws MultiObservationException, InvalidObservationException;

    Set<OWLAxiom> getObservation() throws MultiObservationException;

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

    Set<IExplanation> getExplanations();

    default String getOutputMessage(){ return ""; }

    default String getFullLog(){ return ""; }

    IAbducibles getAbducibles();

    void setAbducibles(IAbducibles abducibleContainer);

    IExplanationConfigurator getExplanationConfigurator();

    void setExplanationConfigurator(IExplanationConfigurator explanationConfigurator);

}
