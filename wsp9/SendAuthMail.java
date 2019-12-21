package networkimplements.wsp9;

import javax.mail.*;
import javax.mail.internet.*;

import java.util.*;

    public class SendAuthMail{
            public static void main(String[] args) throws Exception{
                Properties myProp = new Properties();
                try{
                    myProp.put("mail.smtp.host", "smtp.gmail.com");
                    myProp.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                    myProp.put("mail.smtp.auth", "true");
                    myProp.put("mail.smtp.port", "465");
                }
                catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("Kullanım: java SEndAuthMail STMP Server");
                    System.exit(0);
                }

                Session mySession= Session.getInstance(myProp, new SMTPAuth());
                Message myMessage= new MimeMessage(mySession);
                Address myFrom= new InternetAddress("emilianojonathan77@gmail.com", "Azat ateş");
                Address myTo= new InternetAddress("emilianojonathan77@gmail.com", "Azat Ateş");
                myMessage.setFrom(myFrom);
                myMessage.setRecipient(Message.RecipientType.TO, myTo);
                myMessage.setSubject("Deneme Maili");

                String icerik= new String("<html>" + "<head>" + "<title>Deneme</title>" + "</head>"+ "<body><font color=\"#336699\" size=11>" + "Merhaba Arkadaşım" + "</font>" + "</body>" + "</html>");
                myMessage.setContent(icerik, "text/html;charset=UTF-8");

                Transport.send(myMessage);Date dt = new Date();
                System.out.println("Mesajınız başarılı bir şekilde gönderildi..."+dt);
    }
}