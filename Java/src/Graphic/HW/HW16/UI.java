package Graphic.HW.HW16;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.*;

public class UI {
    private JFrame frame;
    private JTextField textField;
    private JButton sendButton;
    private JTextArea chatArea;
    private JButton clearButton;
    public UI() {
        // Create the main frame
        frame = new JFrame("Chat Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField = new JTextField();
        sendButton = new JButton("Send");
        clearButton = new JButton("Clear");
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 40));
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(textField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);
        bottomPanel.add(clearButton,BorderLayout.NORTH);
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        sendButton.addActionListener(e -> sendMessage());
        clearButton.addActionListener(e -> chatArea.setText(""));
        textField.addActionListener(e -> sendMessage());


        frame.setSize(400, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void sendMessage() {
        String message = textField.getText().trim();
        if (!message.isEmpty()) {
            chatArea.append(message + "\n");
            textField.setText("");
            textField.requestFocus();
        }
    }
}

