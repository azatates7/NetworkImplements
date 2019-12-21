package networkimplements.wsp7;

import java.net.*;
import java.io.*;

    public class URLConnectionReader {
        public static void main(String[] args) throws Exception {
            URL site = new URL("http://www.google.com/");
            URLConnection con = site.openConnection();
            BufferedReader buf = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputline;
            while ((inputline = buf.readLine()) != null)
                System.out.println(inputline);
            System.out.println(site.getHost());
            buf.close();
        }
    }