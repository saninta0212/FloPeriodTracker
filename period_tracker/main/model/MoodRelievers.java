package model;

import javax.swing.*;

public class MoodRelievers extends MoreMoodRelievers {


    String feelings;

    public MoodRelievers(String feelings) {
        this.feelings = feelings;

    }

   // EFFECTS: prints instructions to take care of yourself depending on the user input of feelings
    @Override
    public String selfLove(String feelings) throws TooManyFeelingException, Cycle.NotTakingCareOfYourselfException {

        if (feelings.equals("anxiety")) {
            anxiety();
            return "LET YOUR SPIRIT GUIDE YOU: "
                  + " Tune into yourself and honor your inner voice. Try journaling about your desires, "
                + "listen to yourself!";


        } else if (feelings.equals("lonely")) {
            lonely();
            return "SURROUND YOURSELF: " + "Use positive affirmations to encourage yourself"
                + " and spend time in Nature grounding to Mother Earth (use rose quartz).";

        } else if (feelings.equals("stressed") || feelings.equals("burned out")) {
            stressed();
            return "TAKE A BREAK: " + " Let your body rest, settle your nervous system by taking a break"
                + " from social media, caffeine, alcohol, refined sugars & stressful situations.";

        } else if (feelings.equals("I hate my life!!!")) {
            throw new TooManyFeelingException();


        } else {
            throw new Cycle.NotTakingCareOfYourselfException();

        }

    }

    @Override
    public boolean predictOvulate() {
        return false;
    }

    public String anxiety() {
        ImageIcon anx = new ImageIcon("icons8-puzzled-26.png");

        JOptionPane.showMessageDialog(null, "LET YOUR SPIRIT GUIDE YOU: "
                        + " Tune into yourself and honor your inner voice. Try journaling about your desires, "
                        + "listen to yourself!", "ANXIETY",JOptionPane.PLAIN_MESSAGE, anx);

        return "LET YOUR SPIRIT GUIDE YOU: "
              + " Tune into yourself and honor your inner voice. Try journaling about your desires, "
              + "listen to yourself!";

    }

    public String lonely() {
        ImageIcon lon = new ImageIcon("kisspng-download-child-lack-of-companion-of-the-child-is-so-lonely-"
                 + "5aa4d1053dd7a6.7067493415207508532533.png");

        JOptionPane.showMessageDialog(null, "SURROUND YOURSELF: " + "Use positive affirmations to encourage yourself"
                 + " and spend time in Nature grounding to Mother Earth (use rose quartz).",
                "LONELY",JOptionPane.PLAIN_MESSAGE,lon);

        return "SURROUND YOURSELF: " + "Use positive affirmations to encourage yourself"
               + " and spend time in Nature grounding to Mother Earth (use rose quartz).";


    }

    public String stressed() {
        ImageIcon stress = new ImageIcon("icons8-work-in-bed-26.png");

        JOptionPane.showMessageDialog(null, "TAKE A BREAK: "
                  + " Let your body rest, settle your nervous system by taking a break"
                 + " from social media, caffeine, alcohol, refined sugars & stressful situations.", "",
                          JOptionPane.PLAIN_MESSAGE,stress);


        return "TAKE A BREAK: " + " Let your body rest, settle your nervous system by taking a break"
            + " from social media, caffeine, alcohol, refined sugars & stressful situations.";

    }
}
