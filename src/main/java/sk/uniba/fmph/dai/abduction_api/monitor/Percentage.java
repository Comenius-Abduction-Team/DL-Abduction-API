package sk.uniba.fmph.dai.abduction_api.monitor;

import sk.uniba.fmph.dai.abduction_api.exception.CommonException;

/**
 * A percentual value represented as an integer in the range [0; 100].
 */
public class Percentage implements Comparable<Percentage> {

    private final int value;

    /**
     * Instantiates a new Percentage. Its value must be in the [0; 100] range, otherwise an exception is thrown.
     *
     * @param value the value
     */
    public Percentage(int value){
        if (value < 0 || value > 100)
            throw new CommonException("Value " + value + "is outside of the percentage range (0-100).");
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return value + " %";
    }

    @Override
    public int compareTo(Percentage other) {
        return Integer.compare(value, other.getValue());
    }
}
