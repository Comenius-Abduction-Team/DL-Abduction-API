package abduction_api.monitors;

import abduction_api.manager.ExplanationWrapper;

import java.util.List;

/**
 */
public class AbductionMonitor {

    List<ExplanationWrapper> explanations;
    double progress = 0;
    String statusMessage = "";
    boolean newExplanation = false;
    boolean newProgress = false;

    public void addNewExplanation(ExplanationWrapper explanation) {
        if(explanation == null) {
            explanations = null;
        } else {
            explanations.add(explanation);
        }
        newExplanation = true;
    }

    public ExplanationWrapper getNextExplanation() {
        if (explanations == null) {
            return null;
        }
        return explanations.get(explanations.size() - 1);
    }

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