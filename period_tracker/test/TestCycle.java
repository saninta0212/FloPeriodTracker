package tests;

import model.Cycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.MenstrualCycleEntries;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCycle {

    Cycle periodCycle;


    @BeforeEach
    public void setup() {


        periodCycle = new Cycle("January", 5, "heavy", 5);


    }


    @Test
    public void testCycle() {
        assertEquals(periodCycle.getLength(), 5);




    }

    @Test
  public void testCycle2() {
        assertEquals(periodCycle.getTypeOfFlow(), "heavy");
    }

    @Test
  public void testCycle3() {
        assertEquals(periodCycle.getMonth(), "January");
    }

    @Test
  public void testCycle4() {

        assertEquals(periodCycle.getStartingDate(), 5);


    }

    @Test
  public void testEquals() {
        assertTrue(periodCycle.equals(periodCycle));

        assertFalse(periodCycle.equals(new Cycle("March", 5, "heavy", 30)));

        assertFalse(periodCycle.equals(new MenstrualCycleEntries()));


        assertFalse(periodCycle.equals(new Cycle("January",8,"patches", 30)));


        assertFalse(periodCycle.equals(new Cycle("March", 5, "patches", 30)));



    }
    
    @Test
    public void testEquals2() {


        assertFalse(periodCycle.equals(new Cycle("March", 8, "heavy", 30)));
        assertFalse(periodCycle.equals(new Cycle("January", 5, "heavy", 30)));
        assertFalse(periodCycle.equals(new Cycle("January", 5, "patches", 5)));
        assertFalse(periodCycle.equals(new Cycle("January", 8, "heavy", 5)));
        assertFalse(periodCycle.equals(new Cycle("March", 5, "heavy", 5)));
        assertFalse(periodCycle.equals(new Cycle("January", 5, "patches", 30)));
        assertFalse(periodCycle.equals(new Cycle("March", 8, "heavy", 5)));




        assertFalse(periodCycle.equals(new Cycle("March", 8, "patches", 30)));

    }

    @Test
  public void testHashcode() {
        periodCycle.hashCode();

    }
}
