import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Event Example");
        frame.setSize(400, 300);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
