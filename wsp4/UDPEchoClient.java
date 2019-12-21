package networkimplements.wsp4;

import java.io.*;
import java.net.*;
import java.util.*;

public class UDPEchoClient{
	private static InetAddress host;
	private static final int PORT=5000;
	private static DatagramSocket datagramSocket;
	private static DatagramPacket inPacket,outPacket;
	private static byte[]buffer;
	public static void main(String []args){
		Scanner exip = new Scanner(System.in); 
		try{ 
			System.out.print("Enter ip for connect : ");
			String myip = exip.next(); 
			host=InetAddress.getByName(myip); // 10.202.17.189
			}
		catch(UnknownHostException ex){
			System.out.println("Host ID not found!");
			System.exit(1);
			}
		accessServer();
		exip.close();
		}
	
	private static void accessServer(){
		Scanner userEntry = new Scanner(System.in);
		try{
			datagramSocket = new DatagramSocket();
			
			String message = "", response = "";
			do{
				System.out.print("Enter message : ");
				message = userEntry.nextLine();
				if(!message.equals("close")){
					outPacket = new DatagramPacket(message.getBytes(), message.length(), host, PORT);
					datagramSocket.send(outPacket);
					buffer = new byte[256];
					inPacket = new DatagramPacket(buffer, buffer.length);
					datagramSocket.receive(inPacket);
					response = new String(inPacket.getData(), 0, inPacket.getLength());
					System.out.println("\nSERVER> "+response);
					
					}
				}
			while(!message.equals("***CLOSE***"));
			userEntry.close();
			}
		catch(IOException ex){
			ex.printStackTrace();
			}
		catch(NullPointerException ex){
			ex.getMessage();
			}
		finally{
			System.out.println("\n* Closing connection... *");
			datagramSocket.close();
				}  
	}
}