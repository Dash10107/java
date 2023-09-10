// import java.net.*;
// public class firt{
// public static void main(String[] args){
// try{
// URL url=new URL("http://www.classroom.google.com/#h");

// System.out.println("Protocol: "+url.getProtocol());
// System.out.println("Host Name: "+url.getHost());
// System.out.println("Port Number: "+url.getPort());
// System.out.println("File Name: "+url.getFile());

// }catch(Exception e){System.out.println(e);}
// }
// }
// import java.net.*;
// public class firt{
// public static void main(String[] args){
// try{
// URL url=new
// URL("https://www.google.com/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
// System.out.println("Protocol: "+url.getProtocol());
// System.out.println("Host Name: "+url.getHost());
// System.out.println("Port Number: "+url.getPort());
// System.out.println("Default Port Number: "+url.getDefaultPort());
// System.out.println("Query String: "+url.getQuery());
// System.out.println("Path: "+url.getPath());
// System.out.println("File: "+url.getFile());
// }catch(Exception e){System.out.println(e);}
// }
// }
// import java.io.*;
// import java.net.*;
// public class firt {
// public static void main(String[] args){
// try{
// URL url=new
// URL("https://www.google.com");
// URLConnection urlcon=url.openConnection();
// InputStream stream=urlcon.getInputStream();
// int i;
// while((i=stream.read())!=-1){
// System.out.print((char)i);
// }
// }catch(Exception e){System.out.println(e);}
// }
// }
import java.io.*;
import java.net.*;
// public class firt{
// public static void main(String[] args){
// try{
// InetAddress ip=InetAddress.getByName("www.google.com");

// System.out.println("Host Name: "+ip.getHostName());
// System.out.println("IP Address: "+ip.getHostAddress());
// System.out.println("Local Host: "+ip.getLocalHost());


// }catch(Exception e){System.out.println(e);}
// }
// }
// import java.net.*;
// public class firt{
// public static void main(String[] args) throws Exception {
// DatagramSocket ds = new DatagramSocket();
// String str = "Welcome java";
// InetAddress ip = InetAddress.getByName("127.0.0.1");
// DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
// ds.send(dp);
// ds.close();
// }
// }
// import java.net.*;
// public class firt{
// public static void main(String[] args) throws Exception {
// DatagramSocket ds = new DatagramSocket(3000);
// byte[] buf = new byte[1024];
// DatagramPacket dp = new DatagramPacket(buf, 1024);
// ds.receive(dp);
// String str = new String(dp.getData(), 0, dp.getLength());
// System.out.println(str);
// ds.close();
// }
// }


//client socket 
import java.io.*;
import java.net.*;
public class firt {
public static void main(String[] args) {
try{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Hello Server");
dout.flush();
dout.close();
s.close();
}catch(Exception e){System.out.println(e);}
}
}