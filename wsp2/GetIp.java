package networkimplements.wsp2;
//Network GetIp Application 24/10/19 v0.1
import java.net.*;

public class GetIp {
	public static void main(String []args) {
			InetAddress ip;
			String hostname;
		try {
			ip = InetAddress.getLocalHost();
            		hostname = ip.getHostName();
           	        System.out.println("Your current IP address : " + ip);
            		System.out.println("Your current Hostname : " + hostname); 
            		
		} 
			catch (UnknownHostException e) {
				e.printStackTrace();
		}
	}
}
