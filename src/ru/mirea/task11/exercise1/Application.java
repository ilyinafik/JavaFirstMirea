package ru.mirea.task11.exercise1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Application {

    int guessCount = 0, random = new Random().nextInt(20);

    public Application() {
        JTextField textField = new JTextField();
        JButton button = new JButton("guess");
        JFrame frame = new JFrame();

        button.addActionListener(e -> {
            try {
                int userGuess = Integer.parseInt(textField.getText());
                if (userGuess == random) {
                    JFrame loseFrame = new JFrame();
                    loseFrame.add(new JTextArea("You win!"));
                    loseFrame.setSize(new Dimension(500, 100));
                    frame.setVisible(false);
                    loseFrame.setVisible(true);
                } else {
                    guessCount++;
                    if (guessCount == 3) {
                        JFrame loseFrame = new JFrame();
                        loseFrame.add(new JTextArea("You lose!"));
                        loseFrame.setSize(new Dimension(500, 100));
                        frame.setVisible(false);
                        loseFrame.setVisible(true);
                    } else {
                        textField.setText("");
                        frame.setTitle(userGuess > random? "before" : "above");
                    }
                }
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            }
        });
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(textField);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 100));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}
