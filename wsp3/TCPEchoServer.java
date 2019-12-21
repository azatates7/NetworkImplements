package networkimplements.wsp3;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPEchoServer{
	private static ServerSocket serverSocket;
	private static final int PORT = 5000;
	public static void main(String[]args){          
		System.out.println("Port açılıyor...\n");
		try{
			  serverSocket = new ServerSocket(PORT);
			}catch(IOException ex){
				System.out.println("Port açilamadi!");
				System.exit(1);        }
		do{	handleClient(); 
		}while (true);
			}
	private static void handleClient(){ 
		Socket link = null;
		try{ 
			link =serverSocket.accept();
			Scanner input = new Scanner(link.getInputStream());            
			PrintWriter output = new PrintWriter(link.getOutputStream(),true);
			int numMessages = 0;
			String message = input.nextLine();
				while (!message.equals("***CLOSE***")){  
					System.out.println("Mesajınızı aldim");
					numMessages++;
					output.println("Mesaj " +numMessages+": " +message);
					message =input.nextLine();
					}
				output.println(numMessages +" mesaj alindi");
				input.close();
					}
			catch(IOException ex){
				ex.printStackTrace();
				}
			finally{
				try{        
					System.out.println("\n* Bağlantı Kapatiliyor... *");
					link.close();
					}
				catch(IOException ex){
					System.out.println("Connected Failed!");
					System.exit(1);        
					}
				          }
		}
	}