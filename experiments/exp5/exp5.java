import java.awt.*;
import java.applet.*;

public class exp5 extends Applet{
Frame f;
public void init(){

f = new Frame("A Frame Window"); // creating frame window using SampleFrame subclass

f.setSize(550, 550); // setting dimension of window f.setVisible(true); // making window visible

}
public void start() {f.setVisible(true); //when applet start ,frame window will appear}
}

public void stop(){f.setVisible(false); // when applet stops ,frame window will be hidden
}

public void paint(Graphics g){
g.drawString("This is in applet window", 10, 20); // text on applet window
}

}