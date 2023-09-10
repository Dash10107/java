import java.awt.*;
public class Box {
    public static void main(String[] args) {
        Frame frame = new Frame("BoxLayout Example");
        Panel panel = new Panel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

   
        panel.add(new Button("Button 1"));
        panel.add(new Button("Button 2"));
        
        panel.add(new Button("Button 3"));
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }
}