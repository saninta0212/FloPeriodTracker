package ui;

import model.Cycle;
import model.MoreMoodRelievers;
import model.Person;
import model.TooManyFeelingException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui {


    public Gui() {

    }

    private static void moodSolutions() {


        String name = JOptionPane.showInputDialog("Write down your name");
        String weig = JOptionPane.showInputDialog("Your weight?");
        int weight = Integer.parseInt(weig);
        String agee = JOptionPane.showInputDialog("Age?");
        int age = Integer.parseInt(agee);

        String bt = JOptionPane.showInputDialog("Enter body temperature ");

        int bodyTemperature = Integer.parseInt(bt);
        String tt = JOptionPane.showInputDialog("Record HeartRate");
        int heartRate = Integer.parseInt(tt);

        String feelings = JOptionPane.showInputDialog("Tell us how you are feeling today!");

        MoreMoodRelievers person = new Person(name, age, weight, heartRate, bodyTemperature, feelings);
        health(person, feelings);



    }


    private static void health(MoreMoodRelievers person, String feelings) {


        String prompt6 = JOptionPane.showInputDialog("Which day of period are you in? ");
        int day = Integer.parseInt(prompt6);

        String typeOfFlow = JOptionPane.showInputDialog("How is your flow?");

        person.suggestFood(day, typeOfFlow);
        person.energizer(day);
        person.meditate(feelings);

        ovulate(person);

        try {
            person.selfLove(feelings);

        } catch (TooManyFeelingException e) {
            e.printStackTrace();

        } catch (Cycle.NotTakingCareOfYourselfException e) {
            e.printStackTrace();
        }


    }

    private static void ovulate(MoreMoodRelievers person) {
        if (person.predictOvulate()) {
            JOptionPane.showMessageDialog(null, "You are ovulating!");
        }
    }

    public static void frame() {

        JFrame frame = getjFrame();

        Font font = new Font("Serif", Font.ITALIC, 30);

        JLabel l = new JLabel("FLO PERIOD TRACKER ");
        l.setFont(font);
        l.setBounds(200, 50, 400, 50);
        frame.add(l);

        JButton b1 = new JButton("READY TO TRACK YOUR PERIOD?");
        frame.add(b1);
        b1.setBounds(250, 500, 250, 50);


        JLabel l2 = new JLabel(new ImageIcon("/Users/sambinaislam/IdeaProjects/project_sambina/rose.png"));
        frame.add(l2);
        l2.setBounds(100,80,550,600);





        b1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    prompts();

                }
            });

    }

    private static JFrame getjFrame() {
        JFrame frame = new JFrame("Flo Period Tracker ");


        frame.setSize(750, 700);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(128, 55, 170));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }


    public static void prompts() {
        MenstrualCycleEntries entry = new MenstrualCycleEntries();

        entry.cycleChart();



        String feelingOverwhelmed = JOptionPane.showInputDialog("Are you feeling overwhelmed today?");

        if (feelingOverwhelmed.equals("Yes")) {

            moodSolutions();

        }
    }
}
