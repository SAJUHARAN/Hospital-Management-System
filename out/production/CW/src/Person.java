import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private String Surname;
    private String dateOfBirth;
    private int mobileNo;

    public Person(String name,String Surname,String dateOfBirth,int mobileNo){
        this.name=name;
        this.Surname=Surname;
        this.dateOfBirth=dateOfBirth;
        this.mobileNo=mobileNo;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurname(){
        return Surname;
    }
    public void setSurname(String Surname){
        this.Surname=Surname;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void SetDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public int getMobileNo(){
        return mobileNo;
    }
    public void setMobileNo(){
        this.mobileNo=mobileNo;
    }



}
