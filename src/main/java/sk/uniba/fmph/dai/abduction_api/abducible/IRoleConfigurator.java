package sk.uniba.fmph.dai.abduction_api.abducible;

import sk.uniba.fmph.dai.abduction_api.exception.NotSupportedException;

/**
 * Interface of an object storing general settings about what role assertions are allowed in the explanations.
 */
public interface IRoleConfigurator extends IExplanationConfigurator {

    default void allowRoleAssertions(Boolean allowRoleAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default void allowLoops(Boolean allowLoops) throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

    default boolean areRoleAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default boolean areLoopsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

    default boolean getDefaultRoleAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default boolean getDefaultLoopsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

    default void setDefaultRoleAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default void setDefaultLoopsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

}
