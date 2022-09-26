import java.net.*;
public class Program2 {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://127.0.0.1:5501/Add%20Gift.html");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host:" + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
