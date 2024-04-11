package sk.uniba.fmph.dai.abduction_api.monitor;

import sk.uniba.fmph.dai.abduction_api.abducer.IExplanation;

import java.util.HashSet;
import java.util.Set;

/**
 * Monitor used to synchronise the solver thread in the asynchronous abduction mode. It also stores
 * the data outputed by the abduction solver and forwards it to other threads waiting for the abduction's results.
 */
public class AbductionMonitor {

    /**
     * Set of new explanations that have not yet been processed by the main thread.
     */
    protected Set<IExplanation> unprocessedExplanations = new HashSet<>();
    /**
     * The percentual progress of the sloving proces.
     */
    protected Percentage progress = new Percentage(0);
    /**
     * The message describing the current status of the solving process.
     */
    protected String statusMessage = "";

    /**
     * How many seconds the monitor waits for the main thread to process the explanations/progress.
     * If the main thread takes more time than this, the control is given back to the solver thread. If the value is 0,
     * this does not occur.
     */
    protected int waitLimit = 0;

    /**
     * Whether there are new explanations in the monitor ready to be processed by the main thread.
     */
    boolean newExplanationsAvailable = false;

    /**
     * Whether there are new explanations in the monitor ready to be processed by the main thread.
     *
     * @return the boolean
     */
    public boolean areNewExplanationsAvailable() {
        return newExplanationsAvailable;
    }

    /**
     * Gets the explanations stored in the monitor.
     *
     * @return the set ofexplanations
     */
    public Set<IExplanation> getUnprocessedExplanations() {
        return unprocessedExplanations;
    }

    /**
     * Mark explanations as processed.
     */
    public void markExplanationsAsProcessed(){
        newExplanationsAvailable = false;
    }

    /**
     * Clear the set of explanations stored in the monitor.
     */
    public void clearExplanations(){
        unprocessedExplanations.clear();
    }

    /**
     * Add new explanation to the monitor.
     *
     * @param explanation the explanation
     */
    public void addNewExplanation(IExplanation explanation) {
        unprocessedExplanations.add(explanation);
        newExplanationsAvailable = true;
    }

    /**
     * Whether there is a new progress update ready to be processed by the main thread.
     */
    boolean newProgressAvailable = false;

    /**
     * Whether there is a new progress update ready to be processed by the main thread.
     *
     * @return the boolean
     */
    public boolean isNewProgressAvailable() {
        return newProgressAvailable;
    }

    /**
     * Mark progress updates as processed by the main thread.
     */
    public void markProgressAsProcessed(){
        newProgressAvailable = false;
    }

    /**
     * Gets the percentual value of how much of the abduction process is done.
     *
     * @return the progress
     */
    public Percentage getProgressPercentage() {
        return progress;
    }

    /**
     * Sets the percentual value of how much of the abduction process is done.
     *
     * @param progress the progress
     */
    public void setProgressPercentage(Percentage progress) {
        this.progress = progress;
        newProgressAvailable = true;
    }

    /**
     * Gets the message describing the current status of the solving process.
     *
     * @return the status message
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the message describing the current status of the solving process.
     *
     * @param statusMessage the status message
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        newProgressAvailable = true;
    }

    /**
     * Deletes all data stored in the monitor.
     */
    public void clearMonitor(){
        clearExplanations();
        progress = new Percentage(0);
        statusMessage = "";
    }

    /**
     * Sets how many seconds the monitor waits for the main thread to process the explanations/progress.
     * If the main thread takes more time than this, the control is given back to the solver thread. If the value is 0,
     * this does not occur.
     * Use to prevent deadlocking.
     *
     * @return the time limit in seconds
     */
    public int getWaitLimit() {
        return waitLimit;
    }

    /**
     * Sets how many seconds the monitor waits for the main thread to process the explanations/progress.
     * If the main thread takes more time than this, the control is given back to the solver thread. If the value is 0,
     * this does not occur.
     *
     * @param waitLimit the time limit in seconds
     */
    public void setWaitLimit(int waitLimit) {
        this.waitLimit = waitLimit;
    }
}