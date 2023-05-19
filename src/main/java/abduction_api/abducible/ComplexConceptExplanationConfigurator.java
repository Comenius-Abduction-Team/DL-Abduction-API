package abduction_api.abducible;

import abduction_api.exception.NotSupportedException;

public interface ComplexConceptExplanationConfigurator extends ExplanationConfigurator {

    default void allowComplexConcepts(Boolean allowComplexConcepts) throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
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

    default boolean getDefaultComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean getDefaultConceptComplementsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }
}
