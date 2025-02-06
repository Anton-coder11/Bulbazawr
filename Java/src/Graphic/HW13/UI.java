//package Graphic.HW13;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class UI extends JFrame implements ActionListener {
//
//
//    public  UI (){
//
//        JFrame frame = new JFrame("Calculator:2347");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout( new GridBagLayout());
//        frame.setSize(300, 800);
//        GridBagConstraints gbc = new GridBagConstraints();
//        frame.setBackground(Color.WHITE);
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.weightx = 0.5;
//        gbc.weighty = 0.1;
//        gbc.fill = GridBagConstraints.BOTH;
//        gbc.insets = new Insets(0,getWidth()/6,0,getWidth()/6);
//
//
//
//        JPanel topPanel = new JPanel();
//        topPanel.setLayout(new GridBagLayout());
//        GridBagConstraints gbc2 = new GridBagConstraints();
//        frame.add(topPanel,gbc);
//        JTextField display = new JTextField("yyyy");
//        display.setEditable(false);
//
//        JLabel evalDisplay = new JLabel("test");
//        gbc2.gridx = 0;
//        gbc2.gridy = 0;
//        gbc2.weightx = 0.9;
//        gbc2.weighty =0.5;
//        gbc2.fill = GridBagConstraints.BOTH;
//        gbc2.insets = new Insets(0,2,0,5);
//        topPanel.add(display,gbc2);
//        gbc2.gridx = 1;
//        gbc2.weightx=0.1;
//
//        topPanel.add(evalDisplay,gbc2);
//
//        gbc.gridy = 1;
//        gbc.weighty=0.7;
//
//        JPanel bottomButtonPanel = new JPanel();
//        bottomButtonPanel.setLayout(new GridLayout(5, 4));
//
//        frame.add(bottomButtonPanel,gbc);
//        String[] buttons = {
//                "sin", "cos", "^", "C",
//                "1", "2", "3", "=",
//                "4", "5", "6", "*",
//                "7", "8", "9", "/",
//                ".", "0", "-", "+"
//        };
//
//        for (String text : buttons) {
//            JButton button = new JButton(text);
//            bottomButtonPanel.add(button);
//            button.addActionListener(new ActionListener() {
//                 @Override
//                 public void actionPerformed(ActionEvent e) {// Missing this method
//
//                     switch (text) {
//                         case "=":
//                             display.setText("");
//                             String expression = evalDisplay.getText();
//                             String[] parts = expression.split("(?<=[-+*/^]|sin|cos)|(?=[-+*/^]|sin|cos)");
//                             double result = Double.parseDouble(parts[0]);
//                             for (int i = 1; i < parts.length; i += 2) {
//                                 String operator = parts[i];
//                                 double operand = Double.parseDouble(parts[i + 1]);
//                                 switch (operator) {
//                                     case "+":
//                                         result += operand;
//                                         break;
//                                     case "-":
//                                         result -= operand;
//                                         break;
//                                     case "*":
//                                         result *= operand;
//                                         break;
//                                     case "^":
//                                         result = Math.pow(result, operand);
//                                         break;
//                                     case "sin":
//                                         // Don't use the previous result, just calculate sin of the operand
//                                         result = Math.sin(Math.toRadians(operand)); // Convert to radians
//                                         break;
//                                     case "cos":
//                                         // Don't use the previous result, just calculate cos of the operand
//                                         result = Math.cos(Math.toRadians(operand)); // Convert to radians
//                                         break;
//                                     case "/":
//                                         result /= operand;
//                                         break;
//                                 }
//                             }
//                             display.setText(Double.toString(result));
//                             evalDisplay.setText("");
//
//                             break;
//                         case "C":
//                             display.setText("");
//                             evalDisplay.setText("");
//                             break;
//                         case "*":
//                             display.setText("");
//                             evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//
//                             break;
//
//                         case "-":
//                             display.setText("");
//                             evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//
//                             break;
//                         case "+":
//                             display.setText("");
//                             evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//                             break;
//                         case "/":
//                             display.setText("");
//                             evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//                             break;
//                         case "^":
//                             display.setText("");
//                             evalDisplay.setText(evalDisplay.getText() + display.getText() + text);
//                             break;
//                         default:
//
//                             display.setText(display.getText() + text);
//                             evalDisplay.setText(evalDisplay.getText() + text);
//
//                             break;
//                     }
//
//                 }
//             })
//        ;}
//
//
//
//
//
//
//        frame.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//    }
//}
package Graphic.HW13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {

    public UI() {
        JFrame frame = new JFrame("Calculator:2347");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(300, 800);
        GridBagConstraints gbc = new GridBagConstraints();
        frame.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, getWidth() / 6, 0, getWidth() / 6);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc2 = new GridBagConstraints();
        frame.add(topPanel, gbc);
        JTextField display = new JTextField("yyyy");
        display.setEditable(false);

        JLabel evalDisplay = new JLabel("test");
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.weightx = 0.9;
        gbc2.weighty = 0.5;
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.insets = new Insets(0, 2, 0, 5);
        topPanel.add(display, gbc2);
        gbc2.gridx = 1;
        gbc2.weightx = 0.1;

        topPanel.add(evalDisplay, gbc2);

        gbc.gridy = 1;
        gbc.weighty = 0.7;

        JPanel bottomButtonPanel = new JPanel();
        bottomButtonPanel.setLayout(new GridLayout(5, 4));

        frame.add(bottomButtonPanel, gbc);
        String[] buttons = {
                "sin", "cos", "^", "C",
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
                public void actionPerformed(ActionEvent e) {
                    if (text.equals("sin") || text.equals("cos")) {
                        evalDisplay.setText(evalDisplay.getText() + text);
                        display.setText("");
                    } else {
                        switch (text) {
                            case "=":
                                display.setText("");
                                String expression = evalDisplay.getText();
                                String[] parts = expression.split("(?<=[-+*/^]|sin|cos)|(?=[-+*/^]|sin|cos)");

                                // Initialize result with first number, handling trig functions
                                double result;
                                if (parts[0].equals("sin")) {
                                    result = Math.sin(Math.toRadians(Double.parseDouble(parts[1])));
                                    parts = java.util.Arrays.copyOfRange(parts, 2, parts.length);
                                } else if (parts[0].equals("cos")) {
                                    result = Math.cos(Math.toRadians(Double.parseDouble(parts[1])));
                                    parts = java.util.Arrays.copyOfRange(parts, 2, parts.length);
                                } else {
                                    result = Double.parseDouble(parts[0]);
                                }

                                // Process the remaining parts
                                for (int i = 1; i < parts.length - 1; i += 2) {
                                    String operator = parts[i];
                                    String nextPart = parts[i + 1];
                                    double operand;

                                    // Handle if next part is a trig function
                                    if (operator.equals("sin")) {
                                        result = Math.sin(Math.toRadians(Double.parseDouble(nextPart)));
                                        continue;
                                    } else if (operator.equals("cos")) {
                                        result = Math.cos(Math.toRadians(Double.parseDouble(nextPart)));
                                        continue;
                                    } else {
                                        operand = Double.parseDouble(nextPart);
                                    }

                                    // Process regular operators
                                    switch (operator) {
                                        case "+":
                                            result += operand;
                                            break;
                                        case "-":
                                            result -= operand;
                                            break;
                                        case "*":
                                            result *= operand;
                                            break;
                                        case "/":
                                            result /= operand;
                                            break;
                                        case "^":
                                            result = Math.pow(result, operand);
                                            break;
                                    }
                                }
                                display.setText(String.valueOf(result));
                                break;

                            case "C":
                                display.setText("");
                                evalDisplay.setText("");
                                break;

                            case "*":
                            case "-":
                            case "+":
                            case "/":
                            case "^":
                                display.setText("");
                                evalDisplay.setText(evalDisplay.getText() + text);
                                break;

                            default:
                                display.setText(display.getText() + text);
                                evalDisplay.setText(evalDisplay.getText() + text);
                                break;
                        }
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