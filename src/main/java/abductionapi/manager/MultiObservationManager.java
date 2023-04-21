package abductionapi.manager;

import abductionapi.exception.InvalidObservationException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Set;

public interface MultiObservationManager {

    default void setMultipleObservations(Set<OWLAxiom> observation) throws InvalidObservationException { }

    Set<OWLAxiom> getMultipleObservations();

}
