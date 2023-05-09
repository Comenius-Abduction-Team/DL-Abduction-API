package abduction_api.exception;

import org.semanticweb.owlapi.model.OWLAxiom;

public abstract class AxiomException extends CommonException{

    protected AxiomException(String message, Exception ex) {
        super(message, ex);
    }

    protected AxiomException(String message) {
        super(message, null);
    }

    protected static String printAxiomWithType(OWLAxiom axiom){
        return axiom.toString() + " of type " + axiom.getAxiomType();
    }

}
