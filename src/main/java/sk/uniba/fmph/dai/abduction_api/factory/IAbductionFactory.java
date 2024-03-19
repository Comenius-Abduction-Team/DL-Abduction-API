package sk.uniba.fmph.dai.abduction_api.factory;

import sk.uniba.fmph.dai.abduction_api.abducible.*;
import sk.uniba.fmph.dai.abduction_api.exception.AxiomAbducibleException;
import sk.uniba.fmph.dai.abduction_api.exception.InvalidObservationException;
import sk.uniba.fmph.dai.abduction_api.exception.NotSupportedException;
import sk.uniba.fmph.dai.abduction_api.exception.SymbolAbducibleException;
import sk.uniba.fmph.dai.abduction_api.abducer.IAbducer;
import sk.uniba.fmph.dai.abduction_api.abducer.IThreadAbducer;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Collection;

public interface IAbductionFactory {

    ISolverDescriptor getDescriptor();

    IAbducer getAbducer();

    IAbducer getAbducer(OWLOntology backgroundKnowledge, OWLAxiom observation)
            throws InvalidObservationException;

    IAbducer getAbducer(OWLOntology backgroundKnowledge, Collection<OWLAxiom> observation)
            throws InvalidObservationException;

    default IThreadAbducer getThreadAbducer() throws NotSupportedException {
        throw new NotSupportedException("multi-thread abduction");
    }

    default IThreadAbducer getThreadAbducer(OWLOntology backgroundKnowledge, OWLAxiom observation)
            throws NotSupportedException, InvalidObservationException {
        throw new NotSupportedException("multi-thread abduction");
    }

    default IThreadAbducer getThreadAbducer(OWLOntology backgroundKnowledge, Collection<OWLEntity> observation)
            throws NotSupportedException, InvalidObservationException {
        throw new NotSupportedException("multi-thread abduction");
    }

    IAbducibles getAbducibles();

    default ISymbolAbducibles getSymbolAbducibles()
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default ISymbolAbducibles getSymbolAbducibles(Collection<OWLEntity> symbols)
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default IAxiomAbducibles getAxiomAbducibles()
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default IAxiomAbducibles getAxiomAbducibles(Collection<OWLAxiom> axioms)
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default IExplanationConfigurator getExplanationConfigurator() throws NotSupportedException{
        throw new NotSupportedException("explanation configuration");
    }

    default IConceptConfigurator getConceptConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating concepts in explanations");
    }

    default IComplexConceptConfigurator getComplexConcepConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts in explanations");
    }

    default IRoleConfigurator getRoleConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating roles in explanations");
    }
}
