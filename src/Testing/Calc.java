package Testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JPanel panelMain;
    private JTextField field;
    private JButton divisionButton;
    private JButton multiplicationButton;
    private JButton subtractionButton;
    private JButton additionButton;
    private JButton button8;
    private JButton button9;
    private JButton button1;
    private JButton button0;
    private JButton button7;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton equalButton;
    private JButton button2;
    private JButton OFFButton;
    private JButton CLRButton;

    public Calc() {
        OFFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        CLRButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText("");
            }
        });
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "0");
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "1");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "2");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "4");
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "5");
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "6");
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "7");
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "8");
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText(field.getText() + "9");
            }
        });
        multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multiplicationButton.setBackground(Color.GRAY);
            }
        });
        additionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                additionButton.setBackground(Color.GRAY);
            }
        });
        subtractionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                subtractionButton.setBackground(Color.GRAY);
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                divisionButton.setBackground(Color.GRAY);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("TEST");
        frame.setContentPane(new Calc().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
