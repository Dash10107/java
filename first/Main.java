import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Basic UI Example in Java ");
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        TextField textField = new TextField(20); // Creating a text field
        
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(textField); // Adding the text field
        
        frame.setSize(300, 200);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        // Adding action listeners to the buttons
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hello from Button 1");
            }
        });
        
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hello from Button 2");
            }
        });
    }
}
