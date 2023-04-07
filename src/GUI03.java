import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class GUI03 extends JFrame {
    public JLabel label2= new JLabel();
    public JLabel label3= new JLabel();
    public JLabel label4= new JLabel();

    public JLabel label00 = new JLabel();
    public JLabel label01 = new JLabel();
    public JLabel label02 = new JLabel();
    public JLabel label03 = new JLabel();
    public JLabel label04 = new JLabel();;

   public JLabel label05 = new JLabel();
   public JLabel label06 = new JLabel();
   public JLabel label07 = new JLabel();
   public JLabel label08 = new JLabel();
    public GUI03(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JLabel label1= new JLabel();
        JLabel label2= new JLabel();
        JLabel label3= new JLabel();
        JLabel label4= new JLabel();
        JLabel label5= new JLabel();
        JLabel label6= new JLabel();
        JLabel label7= new JLabel();
        JLabel label8= new JLabel();
        label.setFont(new Font("Sans-serif font", Font.PLAIN, 14));//used font style and size
        label1.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label2.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label3.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label00.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label01.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label02.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label03.setFont(new Font("Sans-serif font", Font.PLAIN, 14));
        label04.setFont(new Font("Sans-serif font", Font.PLAIN, 14));



        label.setText("Patient Name :");
        label1.setText("Patient Surname : ");
        label2.setText("Date of Birth : ");
        label3.setText("Mobile No : ");
        label4.setText("Patient ID : ");
        label5.setText("Date : ");
        label6.setText("Time : ");
        label7.setText("Cost : ");
        label8.setText("Notes : ");
        frame.add(panel);
        panel.add(label);
        panel.add(label00);
        panel.add(label1);
        panel.add(label01);
        panel.add(label2);
        panel.add(label02);
        panel.add(label3);
        panel.add(label03);
        panel.add(label4);
        panel.add(label04);
        panel.add(label5);
        panel.add(label05);
        panel.add(label6);
        panel.add(label06);
        panel.add(label7);
        panel.add(label07);
        panel.add(label8);
        panel.add(label08);

        frame.setSize(1080, 720);
        frame.add(panel);
        frame.setTitle("Patient Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){GUI03 info= new GUI03();}
}