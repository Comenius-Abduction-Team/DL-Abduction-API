package abduction_api.exception;

import org.semanticweb.owlapi.model.OWLAxiom;

public class AxiomAbducibleException extends CommonException {

    public AxiomAbducibleException(OWLAxiom axiom) {
        super("Solver does not support this type of axiom abducible: " +
                axiom + " of type " + axiom.getAxiomType());
    }
}
