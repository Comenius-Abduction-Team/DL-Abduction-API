package abduction_api.factories;

import abduction_api.abducibles.AxiomAbducibleContainer;
import abduction_api.abducibles.SymbolAbducibleContainer;
import abduction_api.exception.AxiomAbducibleException;
import abduction_api.exception.NotSupportedException;
import abduction_api.exception.SymbolAbducibleException;
import abduction_api.manager.AbductionManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

public interface AbductionFactory {

    AbductionManager getAbductionManager();

    AbductionManager getAbductionManagerWithInput(OWLOntology knowledgeBase, OWLAxiom observation);

    default AbductionManager getAbductionManagerWithSymbolAbducibles(Set<OWLEntity> symbols)
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default AbductionManager getAbductionManagerWithAxiomAbducibles(Set<OWLAxiom> axioms)
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }

    default SymbolAbducibleContainer getSymbolAbducibleContainer()
            throws NotSupportedException, SymbolAbducibleException {
        throw new NotSupportedException("symbol abducibles");
    }

    default AxiomAbducibleContainer getAxiomAbducibleContainer()
            throws NotSupportedException, AxiomAbducibleException {
        throw new NotSupportedException("axiom abducibles");
    }
}
