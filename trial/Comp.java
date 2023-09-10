import java.awt.*;

import java.awt.event.*;

public class Comp extends Frame implements ComponentListener {

TextArea t1;

Checkbox c1;

Checkbox c2;

Comp() {

t1 = new TextArea();

c1 = new Checkbox("CJ");

c2 = new Checkbox("AJ");

add(t1, BorderLayout.CENTER);

add(c1, BorderLayout.NORTH);

add(c2, BorderLayout.SOUTH);

setSize(400,400);

setVisible(true);

addComponentListener(this);

}

public void componentShown(ComponentEvent evt) {

System.out.println("componentShown");

}

public void componentHidden(ComponentEvent evt) {

System.out.println("componentHidden");

}

public void componentMoved(ComponentEvent evt) {

System.out.println("componentMoved");

}

public void componentResized(ComponentEvent evt) {

System.out.println("componentResized");

}

public static void main(String[] args) throws Exception{
Comp cd=new Comp();

Thread.sleep(45000);

System.exit(0);

} }