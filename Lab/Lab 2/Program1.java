import java.net.InetAddress;
import java.net.*;
public class Program1{
    public static void main(String[] args) {
        try{
            // First
            InetAddress ip = InetAddress.getByName("darshan.ac.in");
            System.out.println("Ip Name: " + ip);
            // Second
            InetAddress allIp[] = InetAddress.getAllByName("wixnets.com");
            for (InetAddress ipx : allIp) {
                System.out.println(ipx);
            }
            // third
            InetAddress host = InetAddress.getLocalHost();
            System.out.println("Localhost: " + host);
            // fourth
            InetAddress ip2 = InetAddress.getByName("darshan.ac.in");
            System.out.println("Hostname: " + ip2.getHostName());
            System.out.println("HostAddress: " + ip2.getHostAddress());
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}