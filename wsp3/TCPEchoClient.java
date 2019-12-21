package networkimplements.wsp3;

import java.io.*;
import java.net.*;
import java.util.*;
public class TCPEchoClient{
	private static InetAddress host;
	private static final int PORT = 5005;
	public static void main(String[]args){
		try{
			host = InetAddress.getByName("10.202.17.189");
			}
		catch(UnknownHostException ex){
			System.out.println("Host bulunamadi!");
			System.exit(1);
			}
		accessServer(); 
			}
	private static void accessServer(){  
		Socket link =null;
		try{
			link =new Socket(host,PORT);
			Scanner input =new Scanner(link.getInputStream());
		    PrintWriter output =new PrintWriter(link.getOutputStream(),true);
		    Scanner userEntry = new Scanner(System.in);
		    String message,response;
		    do{
		    	System.out.print("Bir mesaj girin: ");
		    	message =userEntry.next();
		    	output.println(message);
		    	response =input.next();                    
		    	System.out.println("\nSERVER> "+response);            
		    	}
		    while (!message.equals("close"));
		    userEntry.close();
		    input.close();
		    }
		catch(IOException ex){
			ex.printStackTrace();
				}
		finally{
			try{
				System.out.println("\n* Baglanti kapatiliyor... *");
				link.close();           
				}
			catch(IOException ex){
				System.out.println("Baglanti kesilemedi!");
				System.exit(1);
				}
			}
		}
	}	     