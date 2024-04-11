package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.NotSupportedException;

/**
 * Interface of an object storing general settings about what atomic concept assertions are allowed in the explanations.
 */
public interface IConceptConfigurator extends IExplanationConfigurator {

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
