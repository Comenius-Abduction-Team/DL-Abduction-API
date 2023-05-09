package abduction_api.manager;

import abduction_api.exception.InvalidObservationException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Set;

public interface MultiObservationManager extends AbductionManager {

    void setMultiAxiomObservation(Set<OWLAxiom> observation) throws InvalidObservationException;

    Set<OWLAxiom> getMultiAxiomObservation();

}
