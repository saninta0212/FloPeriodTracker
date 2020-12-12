package model;

import javax.swing.*;

public abstract class MoreMoodRelievers implements SelfCare {




  // EFFECTS: instructs the user to eat a particular kind of food depending on the day of their flow and typeOfFlow

    @Override
    public String suggestFood(int day, String typeOfFlow) {


        if (day <= 3 || (typeOfFlow.equals("heavy"))) {

            JOptionPane.showMessageDialog(null,"Eat bananas for iron, milk for calcium and eggs!",
                    "", JOptionPane.PLAIN_MESSAGE,new ImageIcon("icons8-eggs-26.png"));
            return "Eat bananas for iron, milk for calcium and eggs!";

        } else {

            JOptionPane.showMessageDialog(null,"Drink more milk: what nutrition does milk not contain?! "
                    + "Salmon: Salmon is a great food during your period rich in vitamin "
                    + "b12 and Omega-3 and 612 fatty acids. ","",JOptionPane.PLAIN_MESSAGE,
                      new ImageIcon("icons8-fish-26.png"));


            return "Drink more milk: what nutrition does milk not contain?! "
                    + "Salmon: Salmon is a great food during your period rich in vitamin "
                      + "b12 and Omega-3 and 612 fatty acids. ";


        }
    }




  // EFFECTS: instructs the user to meditate if they are feeling anxious or depressed

    public String meditate(String feelings) {

        ImageIcon meditate = new ImageIcon();

        if (feelings.equals("anxious") | feelings.equals("depressed")) {
            JOptionPane.showMessageDialog(null, "Today, you should spend 10 minutes meditating "
                    + "and feeling your inner spirit.","",JOptionPane.PLAIN_MESSAGE,meditate);

        }
        return "Today, you should spend 10 minutes meditating and feeling your inner spirit.";
    }


    public abstract String selfLove(String feelings) throws TooManyFeelingException,
               Cycle.NotTakingCareOfYourselfException;


  // EFFECTS: prints instructions for kind of workout to engage in depending on day of period

    public String energizer(int day) {
        ImageIcon energizer = new ImageIcon("icons8-exercise-26.png");
        if (day <= 3) {
            JOptionPane.showMessageDialog(null, "Go for jogging! Take a break and listen"
                    + " to your favorite music", "",JOptionPane.PLAIN_MESSAGE,energizer);

            return "Go for jogging! Take a break and listen to your favorite music";

        } else {
            JOptionPane.showMessageDialog(null, "Do cardio !!", "",
                    JOptionPane.PLAIN_MESSAGE,energizer);

            return "Do cardio !!";
        }
    }

    public abstract boolean predictOvulate();






}
