package abductionapi.exception;

import org.semanticweb.owlapi.model.OWLAxiom;

public class InvalidObservationException extends CommonException {

    public InvalidObservationException(OWLAxiom axiom) {
        super("Solver does not support this type of observation axiom: " +
                axiom + " of type " + axiom.getAxiomType());
    }
}
