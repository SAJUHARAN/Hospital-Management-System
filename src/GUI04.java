import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class GUI04 extends JFrame {
    static ArrayList<Patient> PAT = new ArrayList<>();
    static ArrayList<consultation> CON= new ArrayList<>();

    public GUI04() throws IOException, ClassNotFoundException {
        loadData();
        loadData2();


        JTable table = new JTable(toTableModel(PAT));
        JButton button = new JButton();

        button.setText("Confirm");
        button.setBounds(450, 300, 100, 30);
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        table.setAutoCreateRowSorter(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1080, 720);
        frame.add(button);
        frame.add(table);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button ){
                    GUI03 info = new GUI03();
                    int count = table.getSelectedRow();
                    int index = count-1;

                    DefaultTableModel tables = (DefaultTableModel) table.getModel();
                    String name = tables.getValueAt(count,0). toString();
                    info.label00.setText(name);
                    String surname = tables.getValueAt(count,1). toString();
                    info.label01.setText(surname);
                    String DateofBirth = tables.getValueAt(count,2). toString();
                    info.label02.setText(DateofBirth);
                    String MobNo = tables.getValueAt(count,3). toString();
                    info.label03.setText(MobNo );
                    String PatientID = tables.getValueAt(count,4). toString();
                    info.label04.setText(PatientID);

                    String date= String.valueOf(CON.get(index).getdate());
                    info.label05.setText(date);
                    String time = CON.get(index).gettime();
                    info.label06.setText(time);
                    int cost= CON.get(index).getcost();
                    info.label07.setText(String.valueOf(cost));
                    String notes= CON.get(index).getNotes();
                    info.label08.setText(notes);





                }
            }
        });
        frame.setVisible(true);


    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GUI04 saved = new GUI04();
    }
    public static void loadData() throws IOException, ClassNotFoundException {
        File file = new File("text.txt");
        if (file.isFile()) // to determine whether it is a file or not//
        {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file)); // creates a objectInputStream using fileInputStream//
            PAT = (ArrayList<Patient>) obj.readObject(); // loading the object from file//
            obj.close();
            System.out.println("Data loaded \n");
        }
    }

    public static void loadData2() throws IOException, ClassNotFoundException {
        File file = new File("text1.txt");
        if (file.isFile()) // to determine whether it is a file or not//
        {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file)); // creates a objectInputStream using fileInputStream//
            CON= (ArrayList<consultation>) obj.readObject(); // loading the object from file//
            obj.close();
            System.out.println("Data loaded \n");
        }
    }

    public static TableModel toTableModel(ArrayList<Patient> patients) {
        DefaultTableModel table = new DefaultTableModel(new Object[]{"Name", "Surname", "Date Of Birth", "Mobile No", "ID"}, 0);
        table.addRow(new Object[]{"Name", "Surname", "Date Of Birth", "Mobile No", "ID"});
        for (Patient PAT : patients) {
            table.addRow(new Object[]{PAT.getName(), PAT.getSurname(), PAT.getDateOfBirth(), PAT.getMobileNo(), PAT.getUniqueId()});
        }
        return table;
    }
}