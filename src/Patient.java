public class Patient extends Person {
    private int uniqueId;

    public Patient(String uniqueId, String name, String Surname, int dateOfBirth, int mobileNo) {
        super(name, Surname, String.valueOf(dateOfBirth), mobileNo);

    }



    public int getUniqueId(){
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
}
