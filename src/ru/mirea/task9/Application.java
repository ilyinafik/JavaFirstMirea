package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class Application {

    private String team1 = "AC Milan";
    private String team2 = "Real Madrid";

    private int score1 = 0;
    private int score2 = 0;

    private JButton button1 = new JButton(team1);
    private JButton button2 = new JButton(team2);
    private JButton button3 = new JButton("FINISH");
    private JLabel label1 = new JLabel("0 x 0");
    private JLabel label2 = new JLabel("Last Scorer: N/A");

    public Application() {
        JFrame frame = new JFrame();
        button1.addActionListener(e -> addPoint1());
        button2.addActionListener(e -> addPoint2());
        button3.addActionListener(e -> {
            JFrame frame2 = new JFrame();
            String winner;
            if (score1 > score2) {
                winner = team1;
            } else if (score1 < score2) {
                winner = team2;
            } else {
                winner = "DRAW";
            }
            JLabel label3 = new JLabel(String.format("WINNER: %s", winner));
            frame2.add(label3);
            frame2.pack();
            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
        frame.add(label1);
        frame.add(label2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void addPoint1() {
        score1 += 1;
        setLastScorer(team1);
        updateScore();
    }

    public void addPoint2() {
        score2 += 1;
        setLastScorer(team2);
        updateScore();
    }

    private void updateScore() {
        label1.setText(String.format("%d x %d", score1, score2));
    }

    private void setLastScorer(String team) {
        label2.setText(String.format("Last scorer: %s", team));
    }

    public static void main(String[] args) {
        new Application();
    }
}