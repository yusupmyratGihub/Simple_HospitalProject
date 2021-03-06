public class Employee {
    private int personelID;
    private String fullName;
    private String lastName;
    private String country;
    private String birthDate;
    private String gender;
    private String adress;
    private int phone;
    private String email;

    public Employee(int personelID, String fullName, String lastName, String country, String birthDate, String gender, String adress, int phone, String email) {
        this.personelID = personelID;
        this.fullName = fullName;
        this.lastName = lastName;
        this.country = country;
        this.birthDate = birthDate;
        this.gender = gender;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }


    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }




    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personelID=" + personelID +
                ", fullName='" + fullName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                ", adress='" + adress + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
