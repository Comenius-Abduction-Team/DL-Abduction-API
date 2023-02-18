package abductionapi.abducibles;


import abductionapi.exception.NotSupportedException;

/**
 * Interface declaring methods to configure the usage of general concepts in explanations.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public interface ConceptAbducibleConfigurator {

    /**
     * Method that allows concept assertions at abduction.
     * @throws NotSupportedException if solver does not support concept assertions enabling.
     */
    default void allowConceptAssertions() throws NotSupportedException {
        throw new NotSupportedException("enabling concept assertions");
    }

    /**
     * Enables/disables concept assertions at abduction.
     * @param allowConceptAssertions is a flag which indicates if concept assertions are enabled or not.
     * @throws NotSupportedException if solver does not support concept assertions enabling.
     */
    default void allowConceptAssertions(Boolean allowConceptAssertions) throws NotSupportedException {
        throw new NotSupportedException("enabling concept assertions");
    }

    default boolean areConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("enabling concept assertions");
    }
}
