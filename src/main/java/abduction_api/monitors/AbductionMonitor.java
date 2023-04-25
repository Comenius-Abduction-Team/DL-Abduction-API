package abduction_api.monitors;

import abduction_api.manager.ExplanationWrapper;

import java.util.Set;

/**
 */
public class AbductionMonitor {

    Set<ExplanationWrapper> explanations;
    double progress = 0;
    String statusMessage = "";

    boolean newExplanationsAvailable = false;
    boolean newProgressAvailable = false;

    public boolean areNewExplanationsAvailable() {
        return newExplanationsAvailable;
    }

    public boolean isNewProgressAvailable() {
        return newProgressAvailable;
    }

    public void markExplanationsAsProcessed(){
        newExplanationsAvailable = false;
    }

    public void markProgressAsProcessed(){
        newProgressAvailable = false;
    }

    public void addNewExplanation(ExplanationWrapper explanation) {
        explanations.add(explanation);
        newExplanationsAvailable = true;
    }

    public Set<ExplanationWrapper> getExplanations() {
        return explanations;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
        newProgressAvailable = true;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        newProgressAvailable = true;
    }
}