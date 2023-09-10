import java.awt.*;

import java.awt.event.*;

public class Action extends Frame implements ActionListener{

TextField tf;

Button b;

Action(){

tf=new TextField();

tf.setBounds(50,50, 150,20);

b=new Button("Click Here");

b.setBounds(50,100,60,30);

b.addActionListener(this);

add(b);add(tf);

setSize(400,400);

setLayout(null);

setVisible(true);

}

public void actionPerformed(ActionEvent e){

String str=tf.getText();

tf.setText("Welcome " +str);

}

public static void main(String[] args) throws Exception{

Action ae=new Action();
Thread.sleep(20000);

System.exit(0);

}

}