package abductionapi.factories;

import abductionapi.abducibles.AxiomAbducibleContainer;
import abductionapi.abducibles.SymbolAbducibleContainer;
import abductionapi.exception.NotSupportedException;
import abductionapi.manager.AbductionManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

/**
 * AbductionManagerAndAbducibleContainerFactory generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 * @param <ABDUCTION_MANAGER> AbductionManager type parameter
 */
public interface AbductionFactory<
        ABDUCTION_MANAGER extends AbductionManager,
        SYMBOL_ABDUCIBLE_CONTAINER extends SymbolAbducibleContainer,
        AXIOM_ABDUCIBLE_CONTAINER extends AxiomAbducibleContainer
        > {

    ABDUCTION_MANAGER getSolverSpecificAbductionManager();

    AbductionManager getAbductionManager();

    AbductionManager getAbductionManagerWithInput(OWLOntology knowledgeBase, OWLAxiom observation);

    default AbductionManager getAbductionManagerWithSymbolAbducibles(Set<OWLEntity> symbols){
        throw new NotSupportedException("symbol abducibles");
    }

    default AbductionManager getAbductionManagerWithAxiomAbducibles(Set<OWLAxiom> axioms){
        throw new NotSupportedException("axiom abducibles");
    }

    default AxiomAbducibleContainer getAxiomAbducibleContainer(){
        throw new NotSupportedException("axiom abducibles");
    }

    default SymbolAbducibleContainer getSymbolAbducibleContainer(){
        throw new NotSupportedException("symbol abducibles");
    }

    default AXIOM_ABDUCIBLE_CONTAINER getSolverSpecificAxiomAbducibleContainer(){
        throw new NotSupportedException("axiom abducibles");
    }

    default SYMBOL_ABDUCIBLE_CONTAINER getSolverSpecificSymbolAbducibleContainer(){
        throw new NotSupportedException("symbol abducibles");
    }
}
