package sk.uniba.fmph.dai.abduction_api.factory;

import sk.uniba.fmph.dai.abduction_api.abducible.*;
import sk.uniba.fmph.dai.abduction_api.exception.AxiomAbducibleException;
import sk.uniba.fmph.dai.abduction_api.exception.InvalidObservationException;
import sk.uniba.fmph.dai.abduction_api.exception.NotSupportedException;
import sk.uniba.fmph.dai.abduction_api.exception.SymbolAbducibleException;
import sk.uniba.fmph.dai.abduction_api.abducer.Abducer;
import sk.uniba.fmph.dai.abduction_api.abducer.ThreadAbducer;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Collection;

public interface AbductionFactory {

    SolverDescriptor getDescriptor();

    Abducer getAbducer();

    Abducer getAbducer(OWLOntology backgroundKnowledge, OWLAxiom observation)
            throws InvalidObservationException;

    Abducer getAbducer(OWLOntology backgroundKnowledge, Collection<OWLEntity> observation)
            throws InvalidObservationException;

    default ThreadAbducer getThreadAbducer() throws NotSupportedException {
        throw new NotSupportedException("multi-thread abduction");
    }

    default ThreadAbducer getThreadAbducer(OWLOntology backgroundKnowledge, OWLAxiom observation)
            throws NotSupportedException, InvalidObservationException {
        throw new NotSupportedException("multi-thread abduction");
    }

    default ThreadAbducer getThreadAbducer(OWLOntology backgroundKnowledge, Collection<OWLEntity> observation)
            throws NotSupportedException, InvalidObservationException {
        throw new NotSupportedException("multi-thread abduction");
    }

    Abducibles getAbducibles();

    default SymbolAbducibles getSymbolAbducibles()
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default SymbolAbducibles getSymbolAbducibles(Collection<OWLEntity> symbols)
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default AxiomAbducibles getAxiomAbducibles()
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default AxiomAbducibles getAxiomAbducibles(Collection<OWLAxiom> axioms)
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default ExplanationConfigurator getExplanationConfigurator() throws NotSupportedException{
        throw new NotSupportedException("explanation configuration");
    }

    default ConceptConfigurator getConceptConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating concepts in explanations");
    }

    default ComplexConceptConfigurator getComplexConcepConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts in explanations");
    }

    default RoleConfigurator getRoleConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating roles in explanations");
    }
}
