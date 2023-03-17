package abductionapi.monitors;

import abductionapi.manager.ExplanationWrapper;

import java.util.List;

/**
 */
public class AbductionMonitor {

    List<ExplanationWrapper> explanations;
    double progress = 0;
    String statusMessage = "";
    boolean newExplanation = false;
    boolean newProgress = false;

    /**
     * Add new explanation to the list explanations.
     * @param explanation a new computed explanation to be added to the list
     */
    public void addNewExplanation(ExplanationWrapper explanation) {
        if(explanation == null) {
            explanations = null;
        } else {
            explanations.add(explanation);
        }
        newExplanation = true;
    }

    /**
     * Returns the last computed explanation.
     * @return the last computed explanation
     */
    public ExplanationWrapper getNextExplanation() {
        if (explanations == null) {
            return null;
        }
        return explanations.get(explanations.size() - 1);
    }

    /**
     * Returns list of explanations.
     * @return list explanations
     */
    public List<ExplanationWrapper> getExplanations() {
        return explanations;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
        newProgress = true;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        newProgress = true;
    }
}