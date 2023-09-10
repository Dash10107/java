import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drag {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Mouse Drag Example");
        JPanel panel = new JPanel();

        panel.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse dragged to (" + x + ", " + y + ")");
            }
        });

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
