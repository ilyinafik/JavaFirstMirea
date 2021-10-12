package ru.mirea.task8.animation;

import javax.swing.*;
import java.awt.*;

public class AnimationImagePanel extends JPanel {

    private final ImageIcon image;

    public AnimationImagePanel(String path) {
        image = new ImageIcon(path);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(image.getIconWidth(), image.getIconHeight());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - image.getIconWidth()) / 2;
        int y = (getHeight() - image.getIconHeight()) / 2;
        image.paintIcon(this, g, x, y);
    }

}
