package abduction_api.abducibles;

import abduction_api.exception.NotSupportedException;

public interface RoleExplanationConfigurator extends AbducibleContainer {

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

    void setDefaultRoleExplanationConfiguration();
}
