package abductionapi.abducibles;

import abductionapi.exception.NotSupportedException;

public interface RoleAbducibleConfigurator {

    default void allowRoleAssertions() throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default void allowRoleAssertions(Boolean allowRoleAssertions) throws NotSupportedException {
        throw new NotSupportedException("configurating role assertions");
    }

    default void allowLoops() {
        throw new NotSupportedException("configurating loops");
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
}
