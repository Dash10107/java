import java.awt.*;
import java.awt.event.*;

public class Scrollbar implements AdjustmentListener {
    private Frame frame;
    private Label label;
    private java.awt.Scrollbar scrollbar;

    public Scrollbar() {
        frame = new Frame("Scrollbar");
        frame.setSize(400, 400);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        label = new Label("Current value: ");
        frame.add(label);

        scrollbar = new java.awt.Scrollbar();
        scrollbar.addAdjustmentListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(scrollbar);
        frame.setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int value = scrollbar.getValue();
        label.setText("Current value: " + value);
    }

    public static void main(String[] args) {
        new Scrollbar();
    }
}
