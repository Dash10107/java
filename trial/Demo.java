import java.awt.*;

public class Demo {

public static void main(String args[]) throws Exception {

Frame f= new Frame(); // creating frame window

List l1=new List(5); // creating list

Label l=new Label("selected item"); // creating label

l1.setBounds(100,100, 75,75); l.setBounds(150,150,125,125);

l1.add("Item 1"); l1.add("Item 2"); // adding elements to list

l1.add("Item 3"); l1.add("Item 4"); l1.add("Item 5");

f.add(l1); f.add(l);

f.setSize(400,400); f.setLayout(null); f.setVisible(true);

Thread.sleep(10000);

String s=l1.getSelectedItem( ); // retrieving selected item

l.setText(s); // setting label with selected element

Thread.sleep(10000);

System.exit(0);

}

}