package abduction_api.exception;

import org.semanticweb.owlapi.model.OWLAxiom;

public class AxiomAbducibleException extends AxiomException {

    public AxiomAbducibleException(OWLAxiom axiom) {

        super("Solver does not support this type of axiom abducible: " + printAxiomWithType(axiom));
    }
}
