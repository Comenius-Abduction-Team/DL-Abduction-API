package abduction_api.abducibles;

import abduction_api.exception.NotSupportedException;

public interface ConceptExplanationConfigurator extends AbducibleContainer {

    default void allowConceptAssertions(Boolean allowConceptAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean areConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    default boolean getDefaultConceptAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept assertions");
    }

    void setDefaultConceptAbducibleConfiguration();
}
