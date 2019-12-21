package networkimplements.wsp7;

import java.net.*;
import java.util.Scanner;
import java.awt.Toolkit;
import java.io.*;

    public class PortScanner {
        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Type a host name : "); //localhost or 10.202.17.189
            String host= keyboard.next();

            for(int i = 0; i < 100;i++){
                try{
                    InetSocketAddress socketaddress= new InetSocketAddress(host,i);
                    Socket s=new Socket();
                    s.connect(socketaddress,500);
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("\nPort "+i+" open and working");
                     s.close();

                }
                catch(IOException ex){
                    System.out.println(i+" port running");
                }
            }
            keyboard.close();
        }
    }