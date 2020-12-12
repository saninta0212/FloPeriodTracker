package tests;

import model.Cycle;
import model.MoodRelievers;
import model.TooManyFeelingException;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMoodRelievers {

    MoodRelievers selfcare = new MoodRelievers("anxiety");

    @Test
    public void testSelfLove()  {
        try {
            assertEquals(selfcare.selfLove("anxiety"), "LET YOUR SPIRIT GUIDE YOU: "
                          + " Tune into yourself and honor your inner voice. Try journaling about your desires, "
                              + "listen to yourself!");
        } catch (TooManyFeelingException e) {
            fail();
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            fail();
        }


    }

    @Test
    public void testSelfLove2() {
        try {
            assertEquals(selfcare.selfLove("lonely"), "SURROUND YOURSELF: "
                    + "Use positive affirmations to encourage yourself"
                     + " and spend time in Nature grounding to Mother Earth (use rose quartz).");
        } catch (TooManyFeelingException e) {
            fail();
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            fail();
        }

    }

    @Test
    public void testSelfLove3() {
        try {
            assertEquals(selfcare.selfLove("stressed"), "TAKE A BREAK: "
                    + " Let your body rest, settle your nervous system by taking a break"
                      + " from social media, caffeine, alcohol, refined sugars & stressful situations.");
        } catch (TooManyFeelingException e) {
            fail();
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            fail();
        }

    }

    @Test
    public void testSelfLoveFail1() {
        try {
            selfcare.selfLove("I hate my life!!!");
            fail();
        } catch (TooManyFeelingException e) {
            System.out.println("talk to a counsellor!");
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            fail();
        }
    }

    @Test
    public void testSelfLoveFail2() {
        try {
            selfcare.selfLove("ARGHH");
            fail();
        } catch (TooManyFeelingException e) {
            fail();
        } catch (Cycle.NotTakingCareOfYourselfException e) {
            System.out.println("Please take care!");
        }
    }

    @Test
  public void testAnxiety() {
        assertEquals(selfcare.anxiety(),"LET YOUR SPIRIT GUIDE YOU: "
                + " Tune into yourself and honor your inner voice. Try journaling about your desires, "
                + "listen to yourself!");
    }

    @Test
  public  void testLonely() {
        assertEquals(selfcare.lonely(), "SURROUND YOURSELF: "
                + "Use positive affirmations to encourage yourself"
                + " and spend time in Nature grounding to Mother Earth (use rose quartz).");
    }

    @Test
  public void testStressed() {
        assertEquals(selfcare.stressed(), "TAKE A BREAK: "
                + " Let your body rest, settle your nervous system by taking a break"
                + " from social media, caffeine, alcohol, refined sugars & stressful situations.");
    }

    @Test
  public void testOvulate() {
        assertFalse(selfcare.predictOvulate() == true);
        assertTrue(selfcare.predictOvulate() == false);
    }






}
