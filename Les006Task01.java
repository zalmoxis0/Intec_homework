package com.company;

import java.awt.*;
import javax.swing.*;

public class Les006Task01 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Definieer kleurconstanten
        String TEXT_RESET = "\u001B[0m";
        String TEXT_BLACK = "\u001B[30m";
        String TEXT_RED = "\u001B[31m";
        String TEXT_GREEN = "\u001B[32m";
        String TEXT_YELLOW = "\u001B[33m";
        String TEXT_BLUE = "\u001B[34m";
        String TEXT_PURPLE = "\u001B[35m";
        String TEXT_CYAN = "\u001B[36m";
        String TEXT_WHITE = "\u001B[37m";

// Implementatie
        System.out.println(TEXT_RED + "This text is red!" + TEXT_CYAN + "skrrrrt" + TEXT_RESET);
        System.out.println(TEXT_GREEN + "This text is green!" + TEXT_RESET);
        System.out.println(TEXT_BLUE + "This text is blue!" + TEXT_RESET);
        System.out.println(TEXT_YELLOW + "This text is yellow!" + TEXT_RESET);
        System.out.println(TEXT_BLACK + "This text is black!" + TEXT_RESET);
        System.out.println(TEXT_CYAN + "This text is cyan!" + TEXT_RESET);
        System.out.println(TEXT_PURPLE + "This text is green!" + TEXT_RESET);
        System.out.println(TEXT_WHITE + "This text is green!" + TEXT_RESET);
         /*
         Bericht
          */


/*
        JOptionPane.showMessageDialog(null, "Your name:" + JOptionPane.showInputDialog("Name"), "Output", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your age:" + JOptionPane.showInputDialog("Age"), "Output", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your Birth year:" + JOptionPane.showInputDialog("Birth Year"), "Output", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "total:" + JOptionPane.showInputDialog("Name" + "Age" + "Birth Year"), "Output", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "<html><br>First line. <br>Second line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Second line.<br>Third line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Fourth line.<br>Fifth line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Sixth line.<br>Seventh line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Eight line.<br>Nineth line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Tenth line.<br>Eleventh line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Twelfth line.<br>Thirteenth line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Fourteenth line.<br>Fifteenth line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Sixteenth line.<br>Seventeenth line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Eighteenth line.<br>Nineteenth line.</html>");
        JOptionPane.showMessageDialog(null, "<html><br>Twentieth line.<br>Twenty first line.</html>");
*/



        class JOptionPaneExample {

            public String name;
            public int age;
            public int birthYear;

            public JOptionPaneExample() {
                name = "Myself";
                age = 19;
                birthYear = 1994;
            }

            private void displayGUI() {
                JOptionPane.showMessageDialog(
                        null, getPanel(), "Output : ",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            private JPanel getPanel() {
                JPanel panel = new JPanel(new GridLayout(0, 1, 5, 5));
                JLabel nameLabel = getLabel("Your Name : " + name);
                JLabel ageLabel = getLabel("Your Age : " + age);
                JLabel yearLabel = getLabel("Your Birth Year : " + birthYear);
                panel.add(nameLabel);
                panel.add(ageLabel);
                panel.add(yearLabel);

                return panel;
            }

            private JLabel getLabel(String title) {
                return new JLabel(title);
            }

            public void main(String[] args) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        new JOptionPaneExample().displayGUI();
                    }
                };
                EventQueue.invokeLater(runnable);
            }
        }
    }
}
