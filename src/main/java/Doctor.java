public class Doctor extends Employee {

    private int doctorID;

    private String specialist;

    public Doctor(int personelID, String fullName, String lastName, String country, String birthDate, String gender, String adress, int phone, String email, int doctorID, String specialist) {
        super(personelID, fullName, lastName, country, birthDate, gender, adress, phone, email);
        this.doctorID = doctorID;
        this.specialist = specialist;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorID=" + doctorID +
                ", specialist='" + specialist + '\'' +
                "} " + super.toString();
    }
}
