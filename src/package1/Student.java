package package1;

public class Student {
    public Student(){
        System.out.println("This method is called");
    }

    public Student(String firstName, String lastName, int rollNumber, String schoolName, String mail, String religion, String gender) {
        System.out.println("This parameterised constructor is called");
        this.firstName = firstName;

        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.schoolName = schoolName;
        this.mail = mail;
        this.religion = religion;
        this.gender = gender;
    }

    private String firstName;
    private String lastName;
    private int rollNumber;
    private String schoolName;
    private String mail;
    private String religion;
    private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber=" + rollNumber +
                ", schoolName='" + schoolName + '\'' +
                ", mail='" + mail + '\'' +
                ", religion='" + religion + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
