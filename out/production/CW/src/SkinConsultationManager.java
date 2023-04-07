import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

interface SkinConsultationManager  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int Option;
        Scanner a = new Scanner(System.in);
        do {
            System.out.println("______ CONSOLE MENU______");
            System.out.println("1. Add a new doctor ");
            System.out.println("2. Delete a doctor ");
            System.out.println("3. Print the list of doctors ");
            System.out.println("4. Save in file ");
            System.out.println("5. load in file ");
            System.out.println("6.Exit the program");

            Option = a.nextInt();
            switch (Option) {
                case 1:
                    WestminsterSkinConsultationManager.addDoctor(a);
                    break;
                case 2:
                    WestminsterSkinConsultationManager.deleteDoctor(a);
                    break;
                case 3:
                    WestminsterSkinConsultationManager.printListOfDoctors();
                    break;
                case 4:
                    WestminsterSkinConsultationManager.SavedData();
                    break;
                case 5:
                    WestminsterSkinConsultationManager.loadData();
                    break;
                case 6:
                    System.out.println("Exit the program");
                    break;
                default:
                    System.out.println("INVALID!!!");

            }


        } while (Option!= 5);
    }
}
