package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.NotSupportedException;

public interface ConceptConfigurator extends ExplanationConfigurator {

    default void allowConceptAssertions(Boolean allowConceptAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean areConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean getDefaultConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default void setDefaultConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }
}
