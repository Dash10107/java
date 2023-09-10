import java.awt.*;
public class Grid {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout");
        frame.setLayout(new GridLayout(2, 3));

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
    
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
