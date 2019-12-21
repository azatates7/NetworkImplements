package networkimplements.wsp7;

import java.net.*;
import java.util.Scanner;
import java.io.*;

    public class URLParser {
        public static void main(String[] args)throws Exception {
                System.out.println("type a host name : ");
                Scanner keyboard = new Scanner(System.in);
                String host = keyboard.next();
                URL u = new URL("http://"+host+"/");
                URLConnection yc = u.openConnection();
                System.out.println("URL Adress = "+u);
                System.out.println("\n Protocol = "+yc.getLastModified());
                System.out.println("Host = "+u.getHost());
                System.out.println("Port = "+u.getPort());
                System.out.println("Ref = "+u.getRef());
                System.out.println("Authority = "+u.getAuthority());
                System.out.println("Path = "+u.getPath());
                System.out.println("Host = "+u.getQuery());

                keyboard.close();
                      }
                }