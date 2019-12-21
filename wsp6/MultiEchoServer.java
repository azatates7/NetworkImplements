package networkimplements.wsp6;

import java.io.*;
import java.net.*;
import java.util.*;

    public class MultiEchoServer{
        private static ServerSocket serverSocket;
        private static final int PORT = 8001;
        public static void main(String[] args)throws IOException{
            try{
                serverSocket = new ServerSocket(PORT);
                System.out.print("Port opened");
                }
            catch (IOException ex){
                System.out.println("\nPort not opened maybe open!");
                System.exit(1);
                                    }
            do{
                Socket client = serverSocket.accept();
                System.out.println("\nNew client connection accepted.\n");
                ClientHandler handler = new ClientHandler(client);
                handler.start();
    }
    while (true);}}

    class ClientHandler extends Thread{
            private Socket client;
            private Scanner input;
            private PrintWriter output;
            public ClientHandler(Socket socket) {
                client = socket;
                try {
                    input = new Scanner(client.getInputStream());
                    output = new PrintWriter(client.getOutputStream(), true);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        public void run(){
            String received;
            do{
            received = input.nextLine();
            output.println("ECHO: " +received);
        }
        while (!received.equals("exit"));
        try{
            if (client!=null){
                System.out.println("Connection closing...");
                client.close();}
        }
        catch(IOException ex){
            System.out.println("Connect not closed!");}
        }}