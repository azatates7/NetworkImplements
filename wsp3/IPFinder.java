package networkimplements.wsp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPFinder {

	public static void main(String[]args){
		String host;
		Scanner input =new Scanner(System.in);
		System.out.print("\nEnter host name: ");
		host =input.next();
			try{
				InetAddress address = InetAddress.getByName(host);
				System.out.println("IP address: " +address.toString());
				}
			catch (UnknownHostException ex){
				System.out.println(host+"bulunamadi");
				}
			input.close();
			} 
} 