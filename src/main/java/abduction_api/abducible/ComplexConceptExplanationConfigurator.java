package abduction_api.abducible;

import abduction_api.exception.NotSupportedException;

public interface ComplexConceptExplanationConfigurator extends ExplanationConfigurator {

    default void setComplexConceptsAllowed(Boolean allowComplexConcepts) throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default void setConceptComplementsAllowed(Boolean allowConceptComplements) throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default boolean isComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean isConceptComplementsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default boolean getDefaultComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean getDefaultConceptComplementsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }
}
