import java.awt.*;

public class Flow {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout");
        frame.setLayout(new FlowLayout());

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));
        frame.add(new Button("Button 4"));

        frame.setSize(300, 300);
        frame.setVisible(true);   
    }
}
