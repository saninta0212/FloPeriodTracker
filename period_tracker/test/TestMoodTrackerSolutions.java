package tests;

import model.Cycle;
import model.MoreMoodRelievers;
import model.Person;
import model.TooManyFeelingException;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMoodTrackerSolutions {

    @Test
  public void testSuggestFood() {
        MoreMoodRelievers mm = new Person("Jenny", 20, 100, 78, 37, "anxiety");


        assertEquals(mm.suggestFood(3, "heavy"), "Eat bananas for iron, milk for calcium and eggs!");
        assertEquals(mm.suggestFood(5, "heavy"), "Eat bananas for iron, milk for calcium and eggs!");
        assertEquals(mm.suggestFood(5, "patches"), "Drink more milk: what nutrition does milk not contain?! "
                + "Salmon: Salmon is a great food during your period rich in vitamin "
                + "b12 and Omega-3 and 612 fatty acids. ");

    }


    @Test
  public void testSelfLove() {
        MoreMoodRelievers pp = new Person("Jennifer", 15, 56, 100, 35, "worried");
        try {
            pp.selfLove("anxiety");

        } catch (TooManyFeelingException e) {
            System.out.println("Talk to a counsellor!");
            fail();
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            fail();
        }
    }

    @Test
  public void testSelfLoveFail() {
        Person pp = new Person("Austin", 45, 250, 120, 38, "STRESSED");
        try {
            pp.selfLove("I hate my life!!!");
            fail();

        } catch (TooManyFeelingException e) {
            System.out.println("Talk to a counsellor!");
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            fail();
        }

    }

    @Test
  public void testSelfLoveFailTwo() {
        MoreMoodRelievers pp = new Person("Stella", 31, 56, 129, 39, "happy");
        try {
            pp.selfLove("I donot know what to do anymore");
            fail();

        } catch (TooManyFeelingException e) {
            System.out.println("Talk to a counsellor!");
            fail();

        } catch (Cycle.NotTakingCareOfYourselfException e) {
            System.out.println("Please take care of yourself!");

        }
    }

    @Test
  public void testMeditate() {
        MoreMoodRelievers mm = new Person("Robin", 30, 50, 120, 39, "confused");

        assertEquals(mm.meditate("anxious"), "Today, you should spend 10 minutes "
                + "meditating and feeling your inner spirit.");
        assertEquals(mm.meditate("depressed"), "Today, you should spend 10 minutes "
                + "meditating and feeling your inner spirit.");
    }

    @Test
  public void testEnergizer() {
        MoreMoodRelievers mm = new Person("Robin", 30, 50, 120, 39, "confused");

        assertEquals(mm.energizer(5), "Do cardio !!");
        assertEquals(mm.energizer(3), "Go for jogging! Take a break and listen to your favorite music");
    }
    
    @Test
  public void testPredictOvulate() {
        MoreMoodRelievers mm = new Person("Jenny", 20, 100, 78, 37, "anxiety");
        MoreMoodRelievers mp = new Person("mm", 30, 120, 29, 39, "happy");
        MoreMoodRelievers mr = new Person("mr", 15, 123, 122, 38, "lonely");
        assertFalse(mm.predictOvulate());
        assertFalse(mp.predictOvulate());
        assertTrue(mr.predictOvulate());

    }
}



