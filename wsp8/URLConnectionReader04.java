package networkimplements.wsp8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Locale.Category;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

    public class URLConnectionReader04{
        private static String site_adi, site_adi_http;
        private static int site_adi_uz;

        public static void main(String[] args) throws Exception{
            try{
                do{
                    site_adi = JOptionPane.showInputDialog("Site adı giriniz");
                site_adi_uz = site_adi.trim().length();
                if(site_adi_uz> 10) {
                    site_adi_http = site_adi.substring(0,10);
                }
                else{
                    site_adi_http = " ";
                }
            }while(site_adi_http.trim().equals("http://www") );
            }
    catch(Exception ex){
        ex.printStackTrace();
        System.exit(1);
            }
            URL site= new URL("http://www." + site_adi);
            JFileChooser kayitGUI= new JFileChooser();
            kayitGUI.setCurrentDirectory(new File("/home/azatates7/Downloads/"));
            kayitGUI.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); //JFileChooser.DIRECTORIES_ONLY
                if(JFileChooser.APPROVE_OPTION == kayitGUI.showSaveDialog(null)){
                    String yol = kayitGUI.getSelectedFile().getAbsolutePath();
                    FileWriter fileWriter = new FileWriter(yol);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    URLConnection con = site.openConnection();
                    BufferedReader buf = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputline;

                    while((inputline= buf.readLine()) != null){
                        System.out.println(inputline);
                        bufferedWriter.write(inputline);
                    }
                    bufferedWriter.close();
                    System.out.println(site.getHost());
                    JOptionPane.showMessageDialog(null, "Kayıt tamamlandı!");
                }
                else JOptionPane.showMessageDialog(null, "Kayıt iptal edildi!");
        }
    }