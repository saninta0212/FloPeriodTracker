package ui;

import model.Cycle;

import javax.swing.*;
import java.util.*;

public class MenstrualCycleEntries extends Observable   {
    private Map<String, Cycle> menstrualCycle = new HashMap<>();
    private List<Cycle> cycles = new ArrayList<>();

    private User user = new User();
    ImageIcon tampon = new ImageIcon("period.png");

    public MenstrualCycleEntries() {




    }


  // EFFECTS: asks the user to enter cycle details and adds a cycle to list

    public void cycleChart() {


        String nameOfMonth = JOptionPane.showInputDialog("Enter name of month");
        String len = JOptionPane.showInputDialog("Enter cycle length");
        int length = Integer.parseInt(len);
        String typeOfFlow = JOptionPane.showInputDialog("How was your flow?");
        String date = JOptionPane.showInputDialog("Enter your starting date");
        int startingDate = Integer.parseInt(date);


        menstrualCycle.put(nameOfMonth,new Cycle(nameOfMonth, length, typeOfFlow,startingDate));
        cycles.add(new Cycle(nameOfMonth,length,typeOfFlow,startingDate));

        Cycle cycle = menstrualCycle.get(nameOfMonth);

        ImageIcon calendar = new ImageIcon("icons8-circle-bubbles-50.png");

        JOptionPane.showMessageDialog(null,cycle.getMonth() + " : "
                 + "Your period lasted for " + cycle.getLength() + " no of days, "
                  + "Your type of flow was " + cycle.getTypeOfFlow() + " and it started on "
                + cycle.getStartingDate(), "Period Cycle details",JOptionPane.PLAIN_MESSAGE, calendar);

        predictNextPeriod();



    }

    private void predictNextPeriod() {
        String prompt2 = JOptionPane.showInputDialog("Want to retrieve your past period information"
                + " and predict next date?");


        if (prompt2.equals("Yes")) {
            periodChart();
            calculate();

            JOptionPane.showMessageDialog(null, "Your next period date is" +  predict(cycles)
                    + " Make sure you are carrying your tampons!","", JOptionPane.PLAIN_MESSAGE,tampon);
        }


    }


  // EFFECTS: returns details of a specific cycle to the user depending on the name of month

    public void periodChart() {
        String nameOfMonth = JOptionPane.showInputDialog("Enter the name of the month you want to know about!");

        if (!menstrualCycle.containsKey(nameOfMonth)) {
            JOptionPane.showMessageDialog(null,"You didn't have period that month!");
        } else {
            JOptionPane.showMessageDialog(null,menstrualCycle.get(nameOfMonth));


        }
    }

    public int calculate() {

        int averageBleedingPeriod = 0;

        if (! cycles.isEmpty()) {


            for (Cycle c : cycles) {
                int totalBleedingDays = +c.getLength();
                averageBleedingPeriod = totalBleedingDays / cycles.size();
            }
        }
        user.update(averageBleedingPeriod);

        return averageBleedingPeriod;




    }

    public int predict(List<Cycle> cycles) {
        if (cycles.size() == 1) {
            return cycles.get(0).getStartingDate();
        } else if (cycles.isEmpty()) {
            return 0;
        } else {
            return cycles.get(cycles.size() - 1).getStartingDate();
        }
    }
}






