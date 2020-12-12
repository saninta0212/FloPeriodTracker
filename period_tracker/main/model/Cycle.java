package model;

public class Cycle {


    private int length;
    private String typeOfFlow;
    private String month;
    private int startingDate;


    // EFFECTS: Constructs a cycle initialising it with length of period, name of month in which the period cycle took
    //          place, type of flow and starting date of cycle in that month

    public Cycle(String month, int cycleLen, String typeOfFlow, int startingDate) {
        this.month = month;
        this.length = cycleLen;
        this.typeOfFlow = typeOfFlow;
        this.startingDate = startingDate;
    }



    // EFFECTS: returns the length of a cycle

    public int getLength() {
        return length;
    }

    // EFFECTS: returns the typeOfFlow in that particular cycle

    public String getTypeOfFlow() {
        return typeOfFlow;

    }

    // EFFECTS: gets the starting date of period

    public int getStartingDate() {
        return startingDate;
    }

   // EFFECTS: gets the name of month

    public String getMonth() {
        return month;
    }



    public static class NotTakingCareOfYourselfException extends Exception{

    }
}

