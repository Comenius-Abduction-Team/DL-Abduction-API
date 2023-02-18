package abductionapi.abducibles;

import abductionapi.exception.AssertionAbducibleException;
import org.semanticweb.owlapi.model.OWLAxiom;

import java.util.List;
import java.util.Set;


/**
 * Interface declaring methods to add abducibles in the form of DL assertion axioms.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public interface AssertionAbducibleContainer {

    /**
     * Method that adds assertion axiom to an enumeration that is enabled at abduction.
     * @param assertion an assertion axiom to be enabled at abduction.
     * @throws AssertionAbducibleException if solver does not support this type of abducible assertion.
     */
    public void addAssertion(OWLAxiom assertion) throws AssertionAbducibleException;

    /**
     * Method that adds set of assertions to an enumeration that are enabled at abduction.
     * @param assertions an assertion axiom to be enabled at abduction.
     * @throws AssertionAbducibleException if solver does not support this type of abducible assertion.
     */
    public void addAssertions(Set<OWLAxiom> assertions) throws AssertionAbducibleException;

    /**
     * Method that adds list of assertion to an enumeration that are enabled at abduction.
     * @param assertions an assertion axiom to be enabled at abduction.
     * @throws AssertionAbducibleException if solver does not support this type of abducible assertion.
     */
    public void addAssertions(List<OWLAxiom> assertions) throws AssertionAbducibleException;
}
