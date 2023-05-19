package abduction_api.abducible;

import abduction_api.exception.NotSupportedException;

public interface RoleExplanationConfigurator extends ExplanationConfigurator {

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

}
