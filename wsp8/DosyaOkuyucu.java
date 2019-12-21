package networkimplements.wsp8;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

    public class DosyaOkuyucu extends JFrame{
        private JPanel contentPane;
        private JTextArea textArea;
        private JButton btnNewButton;
        private JScrollPane scrollPane;

        public static void main(String[] args){
            EventQueue.invokeLater(new Runnable(){
                public void run(){
                    try{
                        DosyaOkuyucu frame= new DosyaOkuyucu();
                        frame.setLocationRelativeTo(null);
                        frame.setVisible(true);
                        }
                     catch(Exception e){
                          e.printStackTrace();
                                        }
                           }
        }
    );
}
            public DosyaOkuyucu(){
    setTitle("Dosya Okuyucu");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane= new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);

    JPanel panel= new JPanel();
    contentPane.add(panel, BorderLayout.NORTH);

    btnNewButton= new JButton("Dosya Oku");
    btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    btnNewButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0){
         try{
             JFileChooser openGUI= new JFileChooser();
             openGUI.setCurrentDirectory(new File(System.getProperty("user.home").concat("\\Desktop")));
             openGUI.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

             if(JFileChooser.APPROVE_OPTION== openGUI.showOpenDialog(null)){
                 String yol= openGUI.getSelectedFile().getAbsolutePath();
                 System.out.println(yol);

                 FileReader fileReader= new FileReader(yol);
                 BufferedReader bufferedReader= new BufferedReader(fileReader);

                 textArea.setText("");
                 textArea.read(bufferedReader, null);
                 bufferedReader.close();
             }
             else JOptionPane.showMessageDialog(null, "Okuma iptal edildi!");
         }
            catch(Exception ex){
             ex.printStackTrace();
         }
        }
    });
    panel.add(btnNewButton);
    scrollPane= new JScrollPane();
    contentPane.add(scrollPane, BorderLayout.CENTER);
    textArea= new JTextArea();
    scrollPane.setViewportView(textArea);
    textArea.setWrapStyleWord(true);
    textArea.setFont(new Font("Arial", Font.ITALIC, 12));
    textArea.setEditable(false);
        }
        }