package abduction_api.abducibles;

import abduction_api.exception.NotSupportedException;

public interface ConceptAbducibleConfigurator extends AbducibleContainer {

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
