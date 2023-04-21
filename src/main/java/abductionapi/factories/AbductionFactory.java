package abductionapi.factories;

import abductionapi.abducibles.AxiomAbducibleContainer;
import abductionapi.abducibles.SymbolAbducibleContainer;
import abductionapi.exception.NotSupportedException;
import abductionapi.manager.AbductionManager;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLEntity;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;

public interface AbductionFactory<
        ABDUCTION_MANAGER extends AbductionManager,
        SYMBOL_ABDUCIBLES extends SymbolAbducibleContainer,
        AXIOM_ABDUCIBLES extends AxiomAbducibleContainer
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

    default AXIOM_ABDUCIBLES getSolverSpecificAxiomAbducibleContainer(){
        throw new NotSupportedException("axiom abducibles");
    }

    default SYMBOL_ABDUCIBLES getSolverSpecificSymbolAbducibleContainer(){
        throw new NotSupportedException("symbol abducibles");
    }
}
