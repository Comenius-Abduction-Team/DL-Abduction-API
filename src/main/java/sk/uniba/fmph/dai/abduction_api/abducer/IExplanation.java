package sk.uniba.fmph.dai.abduction_api.abducer;

import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.*;

/**
 * A single explanation, consisting of one or more axioms.
 */
public interface IExplanation {

    /**
     * Gets the set of axioms in the explanation.
     *
     * @return the axiom set
     */
    Set<OWLAxiom> getAxiomSet();

    /**
     * Gets a formatted string representation of the explanation. This is the same as a good toString() should be, but
     * exists as a reminder that if you cannot create OWLAxioms from the explanations found by the solver, you may at
     * least store their string representation as a stand-in.
     *
     * @return the text representation
     */
    String getTextRepresentation();

    /**
     * Size/length of the explanation (the number of axioms in it).
     *
     * @return the size
     */
    int size();
}
