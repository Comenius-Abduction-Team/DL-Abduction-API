package abductionapi.monitors;

import abductionapi.manager.ExplanationWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Monitor.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 * @param <EXPLANATION_TYPE> explanation type parameter
 */
public class ExplanationMonitor {

    List<ExplanationWrapper> explanations;

    public ExplanationMonitor() {
        explanations = new ArrayList<>();
    }

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
}