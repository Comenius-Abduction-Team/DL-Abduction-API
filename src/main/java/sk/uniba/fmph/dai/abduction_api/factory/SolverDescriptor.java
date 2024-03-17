package sk.uniba.fmph.dai.abduction_api.factory;

public interface SolverDescriptor {

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
