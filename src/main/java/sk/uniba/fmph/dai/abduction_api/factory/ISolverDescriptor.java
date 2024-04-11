package sk.uniba.fmph.dai.abduction_api.factory;

/**
 * Provides information about which features are implemented by the solver and which are not.
 */
public interface ISolverDescriptor {

    boolean hasThreadMode();

    boolean hasSymbolAbducibles();
    boolean hasAxiomAbducibles();

    boolean hasConceptSwitch();
    boolean hasComplexConceptSwitch();
    boolean hasComplementConceptSwitch();
    boolean hasRoleSwitch();
    boolean hasLoopSwitch();

    boolean hasSpecificParameters();
    boolean hasTimeLimit();

}
