package abductionapi.monitors;

/**
 * Class Monitor.
 * @author Zuzana Hlávková, hlavkovazuz@gmail.com
 *
 * @param <EXPLANATION_TYPE> explanation type parameter
 */
public class ProgressMonitor {

    double progress;
    String statusMessage;

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}