package networkimplements.wsp7;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;
    public class PortScannerDialog{
        public static Scanner keyboard = new Scanner(System.in);
        private static ArrayList<Integer> acik_portlar = new ArrayList<Integer>();
        public static void main(String[] args){
            InetAddress bilAdd = null;
                try{
                    String istenen= JOptionPane.showInputDialog("Type host name for scan : ");
                    bilAdd= InetAddress.getByName(istenen);
                }
                catch(UnknownHostException ex){
                        System.err.println(ex);
                        System.exit(0);
                }
                for(int i = 0; i < 100; i++){
                    try{
                        InetSocketAddress socketaddress = new InetSocketAddress(bilAdd, i);
                        Socket s= new Socket();
                        s.connect(socketaddress, i);
                        s.close();acik_portlar.add(i);
                    }
                    catch(IOException ex){

                    }
                }
                JOptionPane.showMessageDialog(null, "Opened Ports : " + acik_portlar);
                keyboard.close();
        }
    }