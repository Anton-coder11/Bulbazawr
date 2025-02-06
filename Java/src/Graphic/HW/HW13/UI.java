package Graphic.HW.HW13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {


    public  UI (){

        JFrame frame = new JFrame("Calculator:2347");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout( new GridBagLayout());
        frame.setSize(3000, 800);
        GridBagConstraints gbc = new GridBagConstraints();
        frame.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0.3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0,getWidth()/6,0,getWidth()/6);


        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        frame.add(topPanel,gbc);
        JTextField display = new JTextField();
        display.setEditable(false);
//
//        JLabel evalDisplay = new JLabel("test");
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.weightx = 0.8;
        gbc2.weighty =0.5;
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.insets = new Insets(0,2,0,5);
        topPanel.add(display,gbc2);
        gbc2.gridx = 1;
        gbc2.weightx=0.2;
//        topPanel.add(evalDisplay,gbc2);
//
//        gbc.gridy = 1;
//        gbc.weighty=0.7;

        JPanel bottomButtonPanel = new JPanel();
        bottomButtonPanel.setLayout(new GridLayout(5, 4));

        frame.add(bottomButtonPanel,gbc);
        String[] buttons = {
                "none", "none", "none", "C",
                "1", "2", "3", "=",
                "4", "5", "6", "*",
                "7", "8", "9", "/",
                ".", "0", "-", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            bottomButtonPanel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {// Missing this method

                    switch (text) {
//                        case "=":
//
//
//                            display.setText("");
//
//                            System.out.println(sum);
//                            evalDisplay.setText("");
//
//                            break;
//                        case "C":
//                            display.setText("");
//                            evalDisplay.setText("");
//                            break;
//                        case "*":
//                            display.setText("");
//                            evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//
//                            break;
//
//                        case "-":
//                            display.setText("");
//                            evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//
//                            break;
//                        case "+":
//                            display.setText("");
//                            evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//                            break;
//                        case "/":
//                            display.setText("");
//                            evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//                            break;
//                        default:
//
//                            display.setText(display.getText() + text);
//                            evalDisplay.setText(evalDisplay.getText() + text);
//
//                            break;
//                    }
                        case "=":


                            display.setText("");


                            break;
                        case "C":
                            display.setText("");

                            break;
                        case "*":
                            display.setText("");


                            break;

                        case "-":
                            display.setText("");


                            break;
                        case "+":
                            display.setText("");

                            break;
                        case "/":
                            display.setText("");

                            break;
                        default:

                            display.setText(display.getText() + text);


                            break;
                    }
                }
            });
        }





        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
