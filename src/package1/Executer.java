package package1;

public class Executer {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.setFirstName("Soujanya");
        firstStudent.setLastName("Ghosh");
        firstStudent.setRollNumber(02);
        firstStudent.setMail("soujanyaghosh66@gmail.com");
        firstStudent.setSchoolName("Howrah Jogesh Chandra Girls High school");
        firstStudent.setReligion("Hindu");
        firstStudent.setGender("Female");
        Student secondStudent = new Student();
        secondStudent.setFirstName("Srilekha");
        secondStudent.setLastName("Das");
        secondStudent.setRollNumber(03);
        secondStudent.setMail("dassrilekha29@gmail.com");
        secondStudent.setSchoolName("Hindu Girls");
        secondStudent.setReligion("Hindu");
        secondStudent.setGender("Female");
        System.out.println(firstStudent.toString());
        System.out.println(secondStudent.toString());
        Student thirdStudent = new Student("Soujanya","Ghosh",03,"Hindu girls","soujanyaghosh@gmail.com","Hindu","Female");
        System.out.println(thirdStudent.toString());
    }
}
