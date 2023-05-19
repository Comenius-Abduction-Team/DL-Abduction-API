package abduction_api.abducible;

import abduction_api.exception.NotSupportedException;

public interface ConceptExplanationConfigurator extends ExplanationConfigurator {

    default void allowConceptAssertions(Boolean allowConceptAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean areConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean getDefaultConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }
}