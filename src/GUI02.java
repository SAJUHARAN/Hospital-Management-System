import com.github.lgooddatepicker.components.TimePicker;
import com.toedter.calendar.JDateChooser;

//import lu.tudor.santec.jtimechooser.JTimeChooser;

import org.jdatepicker.JDatePicker;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import java.util.ArrayList;
import java.util.Date;

public class GUI02 extends JFrame {
    public JTextField textD1=new JTextField();
    public JTextField textD2=new JTextField();
    public JTextField textD3=new JTextField();
    public JTextField textD4=new JTextField();
    public JTextField textD5=new JTextField();
    public JTextField textD6=new JTextField();
    static ArrayList <Patient> PAT = new ArrayList<>();
    static ArrayList <consultation> CON = new ArrayList<>();
    static JDateChooser date = new JDateChooser();
    static TimePicker time =new TimePicker();


    public GUI02() throws IOException, ClassNotFoundException {
        loadData();
        loadData02();
        JLabel labelD1= new JLabel();
        labelD1.setText("Doctor Name");
        labelD1.setFont(new Font("Sans-serif font",Font.BOLD,14));//used font style and size
        JLabel labelD2= new JLabel();
        labelD2.setText("Doctor surname");
        labelD2.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel labelD3= new JLabel();
        labelD3.setText("Doctor dateOfBirth");
        labelD3.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel labelD4= new JLabel();
        labelD4.setText("Doctor MobileNo");
        labelD4.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel labelD5= new JLabel();
        labelD5.setText("Doctor MedicalLicNo");
        labelD5.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel labelD6= new JLabel();
        labelD6.setText("Doctor Specialisation");
        labelD6.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JFrame frame = new JFrame();
        frame.setSize(1000, 750);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(17,2));
        JLabel label= new JLabel();
        label.setText("Patient's Name");
        label.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label1= new JLabel();
        label1.setText("Patient's Surname");
        label1.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label2= new JLabel();
        label2.setText("Patient's Date Of Birth");
        label2.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label3= new JLabel();
        label3.setText("Patient's Mobile Number");
        label3.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label4= new JLabel();
        label4.setText("Patient's ID");
        label4.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label5= new JLabel();
        label5.setText("Date");
        label5.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label6= new JLabel();
        label6.setText("Time");
        label6.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label7= new JLabel();
        label7.setText("notes");
        label7.setFont(new Font("Sans-serif font",Font.BOLD,14));
        JLabel label8= new JLabel();
        label8.setText("cost");
        label8.setFont(new Font("Sans-serif font",Font.BOLD,14));

        JTextField text= new JTextField();
        JTextField text1= new JTextField();
        JTextField text2= new JTextField();
        JTextField text3= new JTextField();
        JTextField text4= new JTextField();
        JTextField text5=new JTextField();
        JTextField text6=new JTextField();
        JTextField text7=new JTextField();
        JTextField text8=new JTextField();


        JButton button1=new JButton();
        JButton button3=new JButton();
        JButton button4=new JButton();
        JButton button5=new JButton();

        textD1.setText("");
        textD2.setText("");
        textD3.setText("");
        textD4.setText("");
        textD5.setText("");
        textD6.setText("");
        text.setText("");
        text1.setText("");
        text2.setText("");
        text3.setText("11111111");
        text4.setText("000");
        text7.setText("");
        text8.setText("");

        button1.addActionListener(new ActionListener() {//adding buttons to get patient details
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          String name = text.getText();
                                          String surname = text1.getText();
                                          String dob = text2.getText();
                                          int MobileNo = Integer.parseInt(text3.getText());
                                          int ID = Integer.parseInt(text4.getText());
                                          Date date1 = date.getDate();
                                          String time = text6.getText();
                                          PAT.add(new Patient(name,surname,dob,MobileNo,ID));
                                          CON.add(new consultation(date1,time));
                                          try {
                                              saveInfo();
                                              saveInfo02();
                                              System.out.println("patients");

                                          }catch (IOException ex){
                                              throw new RuntimeException();
                                          }

                                      }
                                  });


        button1.setText("Book");
        button1.setFocusable(false);
        button1.setBackground(Color.lightGray);
        button1.setFont(new Font("Sans-serif font",Font.BOLD,14));
        button1.setBounds(400, 100, 100, 40);


                button4.addActionListener(new ActionListener() {//adding button to implement first and second consultation
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        text8.setText(String.valueOf(15));

                    }

                });
                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        text8.setText(String.valueOf(25));
                    }
                });
                button4.setText("First consultation");

                button4.setFocusable(false);
                button4.setBackground(Color.lightGray);
                button4.setFont(new Font("Sans-serif font",Font.BOLD,12));
                button4.setBounds(400, 100, 100, 40);
                button5.setText("Consultation");
                button5.setFocusable(false);
                button5.setBackground(Color.lightGray);
                button5.setFont(new Font("Sans-serif font",Font.BOLD,12));
                button5.setBounds(400, 100, 100, 40);
                panel.add(labelD1);
                panel.add(textD1);
                panel.add(labelD2);
                panel.add(textD2);
                panel.add(labelD3);
                panel.add(textD3);
                panel.add(labelD4);
                panel.add(textD4);
                panel.add(labelD5);
                panel.add(textD5);
                panel.add(labelD6);
                panel.add(textD6);
                frame.add(panel);
                panel.add(label);
                panel.add(text);
                panel.add(label1);
                panel.add(text1);
                panel.add(label2);
                panel.add(text2);
                panel.add(label3);
                panel.add(text3);
                panel.add(label4);
                panel.add(text4);
                panel.add(label5);
                panel.add(date);
                panel.add(label6);
                panel.add(time);
                panel.add(label7);
                panel.add(text7);
                panel.add(button4);
                panel.add(button5);
                panel.add(label8);
                panel.add(text8);
                panel.add(button1);
                panel.add(button3);

                String name = text.getText();
                String surname = text1.getText();
                String dateOfBirth = text2.getText();
                int mobileNo = Integer.parseInt(text3.getText());
                int id = Integer.parseInt(text4.getText());
                PAT.add(new Patient(name, surname, dateOfBirth, mobileNo, id));

              button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button3 ){
                    try {
                        GUI04 saved = new GUI04();


                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }



                }
            }

        });
        button3.setText("View patients detail");
        button3.setFocusable(false);
        button3.setBackground(Color.lightGray);
        button3.setFont(new Font("Sans-serif font",Font.BOLD,14));
        button3.setBounds(400, 100, 100, 40);


        frame.setVisible(true);
            }


    public static void saveInfo() throws IOException {
        File file = new File("text.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject( PAT);
        oos.close();
        System.out.println("Data stored to file successfully\n");
    }

    public static void saveInfo02() throws IOException {
        File file = new File("text1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(CON);
        oos.close();
        System.out.println("Data 1  stored to file successfully\n");
    }

    public static void loadData() throws IOException, ClassNotFoundException {
        try {
            File file = new File("text.txt");
            if (file.isFile()) // // to check weather its a file or not
            {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
                PAT = (ArrayList<Patient>) obj.readObject(); // loads//
                obj.close();
                System.out.println("Data loaded from file Successfully\n");
            }
        }catch (Exception e){}
    }

    public static void loadData02() throws IOException, ClassNotFoundException {
        try {
            File file = new File("text1.txt");
            if (file.isFile()) // // to check weather its a file or not
            {
                ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
                CON  = (ArrayList<consultation>) obj.readObject(); // loads file//
                obj.close();
                System.out.println("Data 1 loaded successfully\n");
            }
        }catch (Exception e){}
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GUI02 details= new GUI02();
    }
}



