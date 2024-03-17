package sk.uniba.fmph.dai.abduction_api.monitor;

import sk.uniba.fmph.dai.abduction_api.abducer.Explanation;

import java.util.HashSet;
import java.util.Set;

public class AbductionMonitor {

    Set<Explanation> unprocessedExplanations = new HashSet<>();
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

    public Set<Explanation> getUnprocessedExplanations() {
        return unprocessedExplanations;
    }

    public void markExplanationsAsProcessed(){
        newExplanationsAvailable = false;
    }

    public void clearExplanations(){
        unprocessedExplanations.clear();
    }

    public void addNewExplanation(Explanation explanation) {
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
        progress = new Percentage(0);
        statusMessage = "";
    }

    public int getWaitLimit() {
        return waitLimit;
    }

    public void setWaitLimit(int waitLimit) {
        this.waitLimit = waitLimit;
    }
}