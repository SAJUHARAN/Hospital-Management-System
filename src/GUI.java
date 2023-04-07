import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GUI extends JFrame  {
    static ArrayList<Doctor> DOC = new ArrayList<>();

    public GUI() throws IOException, ClassNotFoundException {
        loadData();
        JTable table = new JTable(toTableModel(DOC));
        JButton button = new JButton();

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {//creating buttons to get doctors details
                if (e.getSource() == button) {
                    GUI02 info = null;
                    try {
                        info = new GUI02();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                    int count = table.getSelectedRow();
                   DefaultTableModel tab =(DefaultTableModel)table.getModel();
                   String name = tab.getValueAt(count,0).toString();
                   info.textD1.setText(name);
                   String surname = tab.getValueAt(count,1).toString();
                   info.textD2.setText(surname);
                   String dateOfBirth = tab.getValueAt(count,2).toString();
                   info.textD3.setText(dateOfBirth);
                   String mobileNo = tab.getValueAt(count,3).toString();
                   info.textD4.setText(mobileNo);
                   String medicalLicNo = tab.getValueAt(count,4).toString();
                   info.textD5.setText(medicalLicNo);
                   String specialisation = tab.getValueAt(count,5).toString();
                   info.textD6.setText(specialisation);


                }
            }
        });
        button.setText("BOOK");
        button.setFocusable(false);
        button.setBackground(Color.cyan);
        button.setFont(new Font("Times New Roman",Font.BOLD,14));
        button.setBounds(400, 100, 100, 40);
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        frame.setTitle("Doctor Appointment");//creating frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1060, 580);
        frame.add(button);
        frame.add(table);
        frame.setVisible(true);


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GUI booking = new GUI();
    }
    public static void loadData() throws IOException, ClassNotFoundException {  //created load data to load and display in gui
        File file = new File("information.txt");
        if (file.isFile()) // to check weather it's a file or not
        {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
            DOC = (ArrayList<Doctor>) obj.readObject(); // loads  file
            obj.close();
            System.out.println("Successfully data loaded from file \n");
        }
    }

    public static TableModel toTableModel(ArrayList<Doctor> DOC) { // creating tables to display doctors details.


        DefaultTableModel table = new DefaultTableModel(new Object[]{"Name", "Surname", "Date Of Birth", "Mobile No", "Med License No", "Specialisation"}, 0);
        table.addRow(new Object[]{"Name", "Surname", "Date Of Birth", "Mobile No", "License No", "Specialisation"});
        for (Doctor doctor : DOC) {
            table.addRow(new Object[]{doctor.getName(), doctor.getSurname(), doctor.getDateOfBirth(), doctor.getMobileNo(), doctor.getMedicalLicNo(), doctor.getSpecialisation()});

        }

        return table;


    }




}