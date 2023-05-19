package abduction_api.abducible;

import abduction_api.exception.NotSupportedException;

public interface RoleExplanationConfigurator extends ExplanationConfigurator {

    default void setRoleAssertionsAllowed(Boolean allowRoleAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default void setLoopsAllowed(Boolean allowLoops) throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

    default boolean isRoleAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default boolean isLoopsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

    default boolean getDefaultRoleAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default boolean getDefaultLoopsAllowed() throws NotSupportedException {
        throw new NotSupportedException("configurating loops");
    }

}
