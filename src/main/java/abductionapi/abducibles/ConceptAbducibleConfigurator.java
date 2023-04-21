package abductionapi.abducibles;

import abductionapi.exception.NotSupportedException;

public interface ConceptAbducibleConfigurator {

    default void allowConceptAssertions() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default void allowConceptAssertions(Boolean allowConceptAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean areConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }
}
