package abduction_api.monitor;

import abduction_api.manager.ExplanationWrapper;

import java.util.HashSet;
import java.util.Set;

public class AbductionMonitor {

    Set<ExplanationWrapper> unprocessedExplanations = new HashSet<>();
    Percentage progress = new Percentage(0);
    String statusMessage = "";

    private int waitLimit = 0;

    boolean newExplanationsAvailable = false;
    boolean newProgressAvailable = false;

    public boolean isNewProgressAvailable() {
        return newProgressAvailable;
    }

    public Percentage getProgress() {
        return progress;
    }

    public void markProgressAsProcessed(){
        newProgressAvailable = false;
    }

    public void setProgress(Percentage progress) {
        this.progress = progress;
        newProgressAvailable = true;
    }

    public boolean areNewExplanationsAvailable() {
        return newExplanationsAvailable;
    }

    public Set<ExplanationWrapper> getUnprocessedExplanations() {
        return unprocessedExplanations;
    }

    public void markExplanationsAsProcessed(){
        newExplanationsAvailable = false;
    }

    public void clearExplanations(){
        unprocessedExplanations.clear();
    }

    public void addNewExplanation(ExplanationWrapper explanation) {
        unprocessedExplanations.add(explanation);
        newExplanationsAvailable = true;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        newProgressAvailable = true;
    }

    public void clearMonitor(){
        clearExplanations();
        Percentage progress = new Percentage(0);
        statusMessage = "";
    }

    public int getWaitLimit() {
        return waitLimit;
    }

    public void setWaitLimit(int waitLimit) {
        this.waitLimit = waitLimit;
    }
}