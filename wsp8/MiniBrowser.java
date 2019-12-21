package networkimplements.wsp8;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;

    public class MiniBrowser extends JFrame{
        URL myURL;
        TextField Address;
        JEditorPane editorPane;

            public MiniBrowser(){
                super("Mini Browser");
                Address=new TextField("http://www.erkanhoca.com");
                ActionHandler handler=new ActionHandler();
                Address.addActionListener(handler);
                editorPane=new JEditorPane();
                editorPane.setEditable(false);
                editorPane.setContentType("text/html");
                JScrollPane sp=new JScrollPane(editorPane);
                getContentPane().add("Center", sp);
                getContentPane().add("South",Address);
                setSize(1280,720);
                setVisible(true);
                readFile(Address.getText());
            }
            public void readFile(String netAdd){
                try{
                    editorPane.setPage(new URL(netAdd));
                }
            catch(IOException e){
                    System.err.println("Belirtilen URL Okunamıyor"+netAdd);
             }
            }
            public static void main(String args[]) {
                MiniBrowser app=new MiniBrowser();
                app.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }

            private class ActionHandler implements ActionListener{
                public void actionPerformed(ActionEvent e){
                    readFile(Address.getText());
                }
            }
    }