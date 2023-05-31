package abduction_api.factory;

import abduction_api.abducible.*;
import abduction_api.exception.AxiomAbducibleException;
import abduction_api.exception.InvalidObservationException;
import abduction_api.exception.NotSupportedException;
import abduction_api.exception.SymbolAbducibleException;
import abduction_api.manager.AbductionManager;
import abduction_api.manager.MultiObservationManager;
import abduction_api.manager.ThreadAbductionManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Collection;

public interface AbductionFactory {

    AbductionManager getAbductionManager();

    AbductionManager getAbductionManager(OWLOntology backgroundKnowledge, OWLAxiom observation)
            throws InvalidObservationException;

    default MultiObservationManager getMultiObservationAbductionManager() throws NotSupportedException {
        throw new NotSupportedException("multi-axiom observation");
    }

    default MultiObservationManager getMultiObservationAbductionManager(
            OWLOntology backgroundKnowledge, Collection<OWLAxiom> observation)
            throws NotSupportedException, InvalidObservationException {
        throw new NotSupportedException("multi-axiom observation");
    }

    default ThreadAbductionManager getThreadAbductionManager() throws NotSupportedException {
        throw new NotSupportedException("multi-thread abduction");
    }

    default ThreadAbductionManager getThreadAbductionManager(OWLOntology backgroundKnowledge, OWLAxiom observation)
            throws NotSupportedException, InvalidObservationException {
        throw new NotSupportedException("multi-thread abduction");
    }

    AbducibleContainer getAbducibleContainer();

    default SymbolAbducibleContainer getSymbolAbducibleContainer()
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default SymbolAbducibleContainer getSymbolAbducibleContainer(Collection<OWLEntity> symbols)
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default AxiomAbducibleContainer getAxiomAbducibleContainer()
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default AxiomAbducibleContainer getAxiomAbducibleContainer(Collection<OWLAxiom> axioms)
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default ExplanationConfigurator getExplanationConfigurator() throws NotSupportedException{
        throw new NotSupportedException("explanation configuration");
    }

    default ConceptExplanationConfigurator getConceptExplanationConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating concepts in explanations");
    }

    default ComplexConceptExplanationConfigurator getComplexConceptExplanationConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts in explanations");
    }

    default RoleExplanationConfigurator getRoleExplanationConfigurator() throws NotSupportedException {
        throw new NotSupportedException("configurating roles in explanations");
    }
}
