import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Key {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Keyboard Example");
        JPanel panel = new JPanel();

        panel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Key pressed: " + KeyEvent.getKeyText(keyCode));
            }
        });

        panel.setFocusable(true);
        panel.requestFocusInWindow();

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
