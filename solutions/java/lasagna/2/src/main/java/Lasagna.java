public class Lasagna {

    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;
    
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int value){
        return  EXPECTED_MINUTES_IN_OVEN - value;
    }

    public int preparationTimeInMinutes(int time){
        return time*PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int v1, int v2){
        return (v1*PREPARATION_TIME_PER_LAYER) + v2;
    }
}
