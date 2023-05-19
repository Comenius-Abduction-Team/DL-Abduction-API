package abduction_api.monitor;

import abduction_api.exception.CommonException;

public class Percentage implements Comparable<Percentage> {

    private final int value;

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
        return Integer.toString(value);
    }

    @Override
    public int compareTo(Percentage other) {
        return Integer.compare(value, other.getValue());
    }
}
