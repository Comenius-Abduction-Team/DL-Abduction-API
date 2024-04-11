package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.NotSupportedException;

/**
 * Interface of an object storing general settings about what complex concept assertions are allowed in the explanations.
 */
public interface IComplexConceptConfigurator extends IExplanationConfigurator {

    default void allowComplexConcepts(Boolean allowComplexConcepts) throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default void allowComplementConcepts(Boolean allowConceptComplements) throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default boolean areComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean areComplementConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default boolean getDefaultComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean getDefaultComplementConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }

    default boolean setDefaultComplexConceptsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating complex concepts");
    }

    default boolean setDefaultConceptComplementsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating concept complements");
    }
}
