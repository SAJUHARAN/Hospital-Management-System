import java.io.Serializable;

public class Doctor extends Person implements Serializable {
    private int medicalLicNo;

    private String specialisation;
    private String name;
    private String surname;
    private String dateOfBirth;
    private int mobileNo;



    public Doctor(String name, String surname, String dateOfBirth,int mobileNo,int medicalLicNo,String specialisation) {
        super(name, surname, dateOfBirth, mobileNo);
        this.name=name;
        this.surname=surname;
        this.dateOfBirth=dateOfBirth;
        this.mobileNo=mobileNo;
        this.medicalLicNo=medicalLicNo;
        this.specialisation=specialisation;

    }



    public int getMedicalLicNo() {
        return medicalLicNo;
    }
    public void setMedicalLicNo(){
        this.medicalLicNo=medicalLicNo;
    }
    public String getSpecialisation(){
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        specialisation = specialisation;
    }
}