package abduction_api.abducibles;

import abduction_api.exception.NotSupportedException;

public interface ComplexConceptAbducibleConfigurator extends AbducibleContainer {

    default void allowComplexConcepts() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default void allowComplexConcepts(Boolean allowComplexConcepts) throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default void allowConceptComplements() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default void allowConceptComplements(Boolean allowConceptComplements) throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default boolean areComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean areConceptComplementsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    void setDefaultComplexConceptAbducibleConfiguration();
}
