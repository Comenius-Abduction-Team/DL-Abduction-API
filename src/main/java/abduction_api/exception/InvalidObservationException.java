package abduction_api.exception;

import org.semanticweb.owlapi.model.OWLAxiom;

public class InvalidObservationException extends AxiomException {

    public InvalidObservationException(OWLAxiom axiom) {
        super("Solver does not support this type of observation axiom: " + printAxiomWithType(axiom));
    }
}
