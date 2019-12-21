package networkimplements.wsp9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.mail.Authenticator;
import javax.mail.*;

    public class SMTPAuth extends Authenticator{
        public PasswordAuthentication getPasswordAuthentication() {
            System.out.println("Kullanıcı adınızı, şifrenizi giriniz");
            InputStreamReader myReader = new InputStreamReader(System.in);
            BufferedReader  myBuffReader = new BufferedReader(myReader);
            String username = "", password = "";
                try{
                    System.out.print("Kullanıcı adı : ");
                    username = myBuffReader.readLine();
                    System.out.print("\n");
                    System.out.print("Şifre       :");
                    password=myBuffReader.readLine();
                }
                catch(Exception e){

                }
                return new PasswordAuthentication(username,password);
        }
    }