package sk.uniba.fmph.dai.abduction_api.exception;

import org.semanticweb.owlapi.model.OWLAxiom;

public abstract class AxiomException extends CommonException{

    protected AxiomException(String message) {
        super(message, null);
    }

    protected static String printAxiomWithType(OWLAxiom axiom){
        return axiom.toString() + " of type " + axiom.getAxiomType();
    }

}
