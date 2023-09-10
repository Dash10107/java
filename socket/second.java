// import java.net.*;
// public class second{
// public static void main(String[] args) throws Exception {
// DatagramSocket ds = new DatagramSocket();
// String str = "Welcome java";
// InetAddress ip = InetAddress.getByName("127.0.0.1");
// DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
// ds.send(dp);
// ds.close();
// }
// }

//server socket 
import java.io.*;
import java.net.*;
public class second {
public static void main(String[] args){
try{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection
DataInputStream dis=new DataInputStream(s.getInputStream());

String str=(String)dis.readUTF();
System.out.println("message= "+str);
ss.close();
}catch(Exception e){System.out.println(e);}
}
}