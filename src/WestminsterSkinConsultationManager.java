import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class  WestminsterSkinConsultationManager implements SkinConsultationManager {



    static ArrayList<Doctor> DOC = new ArrayList<>(10);

    public static void addDoctor(Scanner a) {

        System.out.println("please enter the following details:-");
        System.out.println("--Enter the name of the doctor-- ");
        String name = a.next();
        System.out.println("--Enter the surname of the doctor--");
        String surname = a.next();
        System.out.println("--Enter the Date of the birth--");
        String dateOfBirth = a.next();
        System.out.println("--Enter the Mobile Number--");
        int mobileNo = a.nextInt();
        System.out.println("--Enter the medical Licence Number--");
        int medicalLicNo = a.nextInt();
        for (Doctor doctor : DOC) {
            if (medicalLicNo == doctor.getMedicalLicNo()) {
                while (true) {
                    System.out.println("Already an existing medical number,ENTER AGAIN");
                    medicalLicNo = a.nextInt();
                    if (medicalLicNo != doctor.getMedicalLicNo())
                        break;
                }
            }
        }
        System.out.println("--Enter the doctors Specialisation--");
        String specialisation = a.next();
        DOC.add(new Doctor(name, surname, dateOfBirth, mobileNo, medicalLicNo, specialisation));
    }

    public static void deleteDoctor(Scanner a) {
        if (!DOC.isEmpty()) {
            System.out.println("Enter the medical licence number you want to delete");
            int medlLicNo = a.nextInt();

            for (int i = 0; i < DOC.size(); i++) {
                if (medlLicNo == DOC.get(i).getMedicalLicNo()) {
                    DOC.remove(i);
                    System.out.println("SUCCESSFULLY deleted the doctor");
                    return;
                }
            }
        } else {
            System.out.println("PLEASE APPOINT A DOCTOR");
            return;
        }
        System.out.println("INVALID! medical licence number ");
    }

;
//        System.out.println("Enter the medical licence number you want to delete");
//        int medlLicNo=a.nextInt();
//        for(int i = 0; i<DOC.size();i++) {
//            if (medlLicNo == DOC.get(i).getMedicalLicNo()) {
//                DOC.remove(i);
//                System.out.println("SUCCESSFULLY deleted the doctor");
//                return;
//            }
//                }else {
//                System.out.println("INVALID!, Enter the valid medical licence number");
//            }
//
//        }
//    }

public static void printListOfDoctors() {
        Collections.sort(DOC, new Comparator<Doctor>() {
@Override
public int compare(Doctor o1, Doctor o2) {
        return o1.getSurname().compareTo(o2.getSurname());
        }

        });
        for (Doctor doc : DOC) {
        System.out.println(doc.getName() + "\n" + doc.getSurname() + "\n" + doc.getDateOfBirth() +"\n"+ doc.getMobileNo()+ "\n" + doc.getMedicalLicNo() + "\n" + doc.getSpecialisation());
        }

//        System.out.println();
//        if (!DOC.isEmpty()) {
//            ArrayList<String> surname = new ArrayList<>(10);
//            for (Doctor doc : DOC) {
//                surname.add(doc.getSurname());
//            }
//            Collections.sort(surname);
//            for (int i = 0; i < DOC.size(); i++) {
//                for (Doctor doc : DOC) {
//                    if (surname.get(i) == doc.getSurname())
//                        System.out.println(DOC);
//                }
//            }
//            System.out.println();
//        } else {
//            System.out.println("\nPlease appoint a doctor to the centre prior display info\n");
//        }
        }

        ;


public static void SavedData() throws IOException {
        File file = new File("information.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(DOC);
        objectOutputStream.close();
        System.out.println("Successfully data Saved to file ");


        }

public static void loadData() throws IOException, ClassNotFoundException {  //created load data to load and display in gui
        File file = new File("information.txt");
        if (file.isFile()) // to check weather its a file or not
        {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
        DOC = (ArrayList<Doctor>) obj.readObject(); // loads  file
        obj.close();
        System.out.println("Successfully data loaded from file \n");
        }
        }
        }















