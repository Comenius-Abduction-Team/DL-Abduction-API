package abductionapi.abducibles;

import abductionapi.exception.AxiomAbducibleException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.List;
import java.util.Set;

/**
 * Interface declaring methods to add abducibles in the form of DL assertion axioms.
 */
public interface AxiomAbducibleContainer {

    /**
     * Adds axiom axiom into the set of abducibles.
     * @throws AxiomAbducibleException if a solver does not support this type of axiom abducible.
     */
    void addAxiom(OWLAxiom axiom) throws AxiomAbducibleException;

    /**
     * Adds a set of assertion axioms into the set of abducibles.
     * @throws AxiomAbducibleException if a solver does not support this type of axiom abducible.
     */
    void addAxioms(Set<OWLAxiom> axioms) throws AxiomAbducibleException;

    /**
     * Adds a list of assertion axioms into the set of abducibles.
     * @throws AxiomAbducibleException if a solver does not support this type of axiom abducible.
     */
    void addAxioms(List<OWLAxiom> axioms) throws AxiomAbducibleException;
}
