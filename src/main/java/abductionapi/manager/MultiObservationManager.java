package abductionapi.manager;

import abductionapi.exception.AxiomObservationException;
import abductionapi.exception.MultiObservationException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.Set;


/**
 * AbductionManager generic interface.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 */
public interface MultiObservationManager {

    /**
     * Sets multi observation for abduction.
     * @param observation multi observation for abduction.
     * @throws MultiObservationException if solver does not support multi observation.
     * @throws AxiomObservationException if solver does not support this type of observation axiom.
     */
    default void setObservations(Set<OWLAxiom> observation) throws AxiomObservationException { }

    /**
     * Returns observation.
     * @return <OBSERVATION_TYPE> observation.
     */
    public Set<OWLAxiom> getObservations();

}
