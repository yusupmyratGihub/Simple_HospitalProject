public class Patient extends Employee {
    private int patientID;


    public Patient(int personelID, String fullName, String lastName, String country, String birthDate, String gender, String adress, int phone, String email, int patientID) {
        super(personelID, fullName, lastName, country, birthDate, gender, adress, phone, email);
        this.patientID = patientID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                "} " + super.toString();
    }
}
