package ui;

import javax.swing.*;

public class User  {
    ImageIcon blood = new ImageIcon("kisspng-blood-clip-art-blood-drop-5a69d084829d83.497661681516884100535.png");
    ImageIcon pad = new ImageIcon("compress.png");

    ImageIcon pad2 = new ImageIcon("kisspng-cloth-napkins-diaper-towel-sanitary-napkin-cloth-m-napkin-"
             + "5ac3431d25b949.6246148115227461411545.png");



    public void update(int days) {

        MenstrualCycleEntries entry = new MenstrualCycleEntries();

        JOptionPane.showMessageDialog(null,"The average bleeding period was " + days, "Bleeding Period",
                JOptionPane.PLAIN_MESSAGE,blood);


        resultofCalcukate(days);












    }

    private void resultofCalcukate(int days) {


        if (days < 3) {

            JOptionPane.showMessageDialog(null, "A lighter period than normal can be caused by "
                    + "many things, including pregnancy, "
                    + "stress illness, and other things. ", "", JOptionPane.PLAIN_MESSAGE,pad);

        } else if (days > 7) {
            JOptionPane.showMessageDialog(null,"Longer than normal periods can occur because of "
                    + "stress, a hormone imbalance, "
                    + "pregnancy, infection, a thyroid condition, and other causes. You should make an appointment with"
                    + " your health care provider","",JOptionPane.PLAIN_MESSAGE,pad2);

        }
    }


}
