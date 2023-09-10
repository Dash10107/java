import java.awt.*;

class Scrollbar {

public static void main(String args[]) throws Exception{

Frame f= new Frame("Menu and MenuItem Example");

Label l=new Label("state") ;

l.setBounds(200,200,200,200);

MenuBar mb=new MenuBar();

Menu menu1=new Menu("File"); // menu

Menu sub=new Menu("Edit"); // sub menu

MenuItem i1=new MenuItem("New");

MenuItem i2=new MenuItem("Save");

MenuItem i3=new MenuItem("Save As");

MenuItem i4=new MenuItem("Open");

CheckboxMenuItem i5=new CheckboxMenuItem("Cut",true);

CheckboxMenuItem i6=new CheckboxMenuItem("Copy");

CheckboxMenuItem i7=new CheckboxMenuItem("Paste");
menu1.add(i1); menu1.add(i4); menu1.add(i2); menu1.add(i3);

menu1.add(sub); // adding sub menu

sub.add(i5); sub.add(i6); sub.add(i7);

mb.add(menu1);

f.setMenuBar(mb);

f.setSize(400,400); f.add(l);

f.setLayout(null);

f.setVisible(true);

Thread.sleep(30000);

Boolean b=i6.getState();

l.setText("state:"+b); Thread.sleep(20000);

System.exit(0);

}

}