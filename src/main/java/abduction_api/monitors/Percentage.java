package abduction_api.monitors;

public class Percentage {

    private final int value;

    public Percentage(int value){
        if (value < 0)
            this.value = 0;
        else if (value > 100)
            this.value = 100;
        else
            this.value = value;
    }

    public int getValue(){
        return value;
    }

}
