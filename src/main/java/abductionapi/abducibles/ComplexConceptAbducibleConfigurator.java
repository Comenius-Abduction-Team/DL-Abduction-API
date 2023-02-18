package abductionapi.abducibles;


import abductionapi.exception.NotSupportedException;

/**
 * Interface declaring methods to configure the usage of complex concepts in explanations.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 */
public interface ComplexConceptAbducibleConfigurator {

    /**
     * Method that allows complex concepts at abduction
     * @throws NotSupportedException if solver does not support complex concept enabling.
     */
    default void allowComplexConcepts() throws NotSupportedException {
        throw new NotSupportedException("enabling complex concept");
    }

    /**
     * Enables/disables complex concepts at abduction.
     * @param allowComplexConcepts is a flag which indicates if complex concepts are enabled or not.
     * @throws NotSupportedException if solver does not support complex concept enabling.
     */
    default void allowComplexConcepts(Boolean allowComplexConcepts) throws NotSupportedException {
        throw new NotSupportedException("enabling complex concept");
    }

    /**
     * Method that allows concept complement at abduction.
     * @throws NotSupportedException if solver does not support concept complement enabling.
     */
    default void allowConceptComplements() throws NotSupportedException {
        throw new NotSupportedException("enabling concept complement");
    }

    /**
     * Enables/disables concept complement at abduction.
     * @param allowConceptComplements is a flag which indicates if concept complement are enabled or not.
     * @throws NotSupportedException if solver does not support concept complement enabling.
     */
    default void allowConceptComplements(Boolean allowConceptComplements) throws NotSupportedException {
        throw new NotSupportedException("enabling concept complement");
    }

    default boolean areComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("enabling complex concept");
    }

    default boolean areConceptComplementsAllowed() throws NotSupportedException {
        throw new NotSupportedException("enabling concept complement");
    }
}
