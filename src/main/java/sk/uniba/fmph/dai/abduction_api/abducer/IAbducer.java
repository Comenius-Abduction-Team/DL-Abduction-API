package sk.uniba.fmph.dai.abduction_api.abducer;

import sk.uniba.fmph.dai.abduction_api.abducible.IAbducibles;
import sk.uniba.fmph.dai.abduction_api.abducible.IExplanationConfigurator;
import sk.uniba.fmph.dai.abduction_api.exception.*;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLOntology;

import java.util.Set;


/**
 * The main interface that handles the abduction problem.
 */
public interface IAbducer {

    /**
     * Sets background knowledge.
     *
     * @param backgroundKnowledge the background knowledge
     */
    void setBackgroundKnowledge(OWLOntology backgroundKnowledge);

    /**
     * Gets background knowledge.
     *
     * @return the background knowledge
     */
    OWLOntology getBackgroundKnowledge();

    /**
     * Sets a single axiom as the observation.
     *
     * @param observation the observation
     * @throws InvalidObservationException if the axiom is not a valid observation for the solver
     */
    void setObservation(OWLAxiom observation) throws InvalidObservationException;

    /**
     * Sets multiple axioms as the observation.
     *
     * @param observation the observation
     * @throws MultiObservationException   if the solver does not support multiple axioms as an observation
     * @throws InvalidObservationException if at least one of the axioms is not a valid observation for the solver
     */
    void setObservation(Set<OWLAxiom> observation) throws MultiObservationException, InvalidObservationException;

    /**
     * Gets the observation.
     *
     * @return the observation
     */
    Set<OWLAxiom> getObservation();

    /**
     * Sets the maximal time limit for the abduction problem.
     *
     * @param seconds how many seconds
     * @throws NotSupportedException if the solver does not implement this functionality
     */
    default void setTimeout(double seconds) throws NotSupportedException {
        throw new NotSupportedException("setting timeout");
    }

    /**
     * Gets the maximal time limit for the abduction problem.
     *
     * @return how many seconds
     * @throws NotSupportedException if the solver does not implement this functionality
     */
    default double getTimeout() throws NotSupportedException {
        throw new NotSupportedException("setting timeout");
    }

    /**
     * Sets parameters that are unique for the solver, in a string formatted like UNIX command line arguments.
     *
     * @param parameters the parameters
     * @throws NotSupportedException           the not supported exception
     * @throws InvalidSolverParameterException if some of the parameters are incorrect/unknown
     */
    default void setSolverSpecificParameters(String parameters) throws NotSupportedException, InvalidSolverParameterException {
        throw new NotSupportedException("setting string parameters");
    }

    /**
     * Resets the solver specific settings to their default values.
     *
     * @throws NotSupportedException if the solver does not implement this functionality
     */
    default void resetSolverSpecificParameters() throws NotSupportedException {
        throw new NotSupportedException("setting string parameters");
    }

    /**
     * Runs abduction solving.
     */
    void solveAbduction();

    /**
     * Get explanations that were found by {@link #solveAbduction() solveAbduction()}.
     *
     * @return the explanations
     */
    Set<IExplanation> getExplanations();

    /**
     * Get text message produced by {@link #solveAbduction() solveAbduction()}. Use for error and exception messages
     * and other simple info.
     *
     * @return the message
     */
    default String getOutputMessage(){ return ""; }

    /**
     * Get the complete log info produced by {@link #solveAbduction() solveAbduction()}. Use for any and all information
     * logged during the abduction solving's run.
     *
     * @return the log
     */
    default String getFullLog(){ return ""; }

    /**
     * Gets abducibles.
     *
     * @return the abducibles
     */
    IAbducibles getAbducibles();

    /**
     * Sets abducibles.
     *
     * @param abducibleContainer the abducible container
     */
    void setAbducibles(IAbducibles abducibleContainer);

    /**
     * Gets explanation configurator.
     *
     * @return the explanation configurator
     */
    IExplanationConfigurator getExplanationConfigurator();

    /**
     * Sets explanation configurator.
     *
     * @param explanationConfigurator the explanation configurator
     */
    void setExplanationConfigurator(IExplanationConfigurator explanationConfigurator);

}
