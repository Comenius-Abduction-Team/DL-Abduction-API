package abductionapi.abducibles;

import abductionapi.exception.NotSupportedException;

/**
 * Interface declaring methods to configure the usage of roles in explanations.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 */
public interface RoleAbducibleConfigurator {

    /**
     * Method that allows role assertions at abduction.
     * @throws NotSupportedException if solver does not support role assertions enabling.
     */
    default void allowRoleAssertions() throws NotSupportedException {
        throw new NotSupportedException("enabling role assertions");
    }

    /**
     * Enables/disables role assertions at abduction.
     * @param allowRoleAssertions is a flag which indicates if role assertions are enabled or not.
     * @throws NotSupportedException if solver does not support role assertions enabling.
     */
    default void allowRoleAssertions(Boolean allowRoleAssertions) throws NotSupportedException {
        throw new NotSupportedException("enabling role assertions");
    }

    /**
     * Method that allows loops at abduction.
     * @throws NotSupportedException if solver does not support loops enabling.
     */
    default void allowLoops() {
        throw new NotSupportedException("enabling loops");
    }

    /**
     * Enables/disables loops at abduction.
     * @param allowLoops is a flag which indicates if loops are enabled or not.
     * @throws NotSupportedException if solver does not support loops enabling.
     */
    default void allowLoops(Boolean allowLoops) throws NotSupportedException {
        throw new NotSupportedException("enabling loops");
    }

    default boolean areRoleAssertionsAllowed() throws NotSupportedException {
        throw new NotSupportedException("enabling role assertions");
    }

    default boolean areLoopsAllowed() throws NotSupportedException {
        throw new NotSupportedException("enabling loops");
    }
}
