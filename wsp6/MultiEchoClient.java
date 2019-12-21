package networkimplements.wsp6;

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiEchoClient{
    private static InetAddress host;
    private static final int PORT = 8001;
    public static void main(String[] args){
        try{
            //host = InetAddress.getLocalHost();
            host=InetAddress.getByName("10.202.17.189");
        }
        catch(UnknownHostException ex){
            System.out.println("\nComputer(Host) not  founded!\n");
            System.exit(1);
        }
        sendMessages();
    }
    private static void sendMessages(){
        Socket socket = null;
        try{
            socket = new Socket(host,PORT);
            Scanner networkInput = new Scanner(socket.getInputStream());
            PrintWriter networkOutput = new PrintWriter(socket.getOutputStream(),true);
            Scanner userEntry = new Scanner(System.in);
            String message,response;
                do{
                    System.out.print("Write a mesage(type 'exit' for exit) : ");
                    message =userEntry.nextLine();
                    networkOutput.println(message);
                    response =networkInput.nextLine();
                    System.out.println("\nSERVER says: > " +response);
                }while (!message.equals("exit"));
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
                try{
                    System.out.println("\nConnection closing");
                    socket.close();
                    System.out.print("Closed, good Bye");}
                catch(IOException ex){
                    System.out.println("Connection not closed!");
                    System.exit(1);
                }
        }
    }
}