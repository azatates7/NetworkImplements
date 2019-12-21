package networkimplements.wsp7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Locale.Category;
import javax.swing.JOptionPane;

    public class URLConnectionReaderGUI {
            private static String site_adi, site_address_http;
            private static int site_adi_uz;

            public static void main(String[] args) throws Exception {
                try{
                    do{
                        site_adi = JOptionPane.showInputDialog("Type a site address : ");
                        site_adi_uz = site_adi.trim().length();
                        if(site_adi_uz> 10) {
                            site_address_http = site_adi.substring(0,10);
                        }
                        else{
                            site_address_http = " ";}
                        }
                    while(site_address_http.trim().equals("http://www") );
                }
            catch(Exception ex) {
                ex.printStackTrace();
                System.exit(1);
                }
                URL site= new URL("http://www." + site_adi);
                URLConnection con = site.openConnection();
                BufferedReader buf = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputline;
                while((inputline= buf.readLine()) != null){
                    System.out.println(inputline);
                }
                System.out.println(site.getHost());
            }
                }