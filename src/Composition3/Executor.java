package Composition3;

public class Executor {
    public static void main(String[] args) {
        Course clgCourse = new Course("BCAC202","BCA");
        clgCourse.enrollStudents("Soujanya",12);
        clgCourse.enrollStudents("Bhumi",10);

        Professor firstProfessor = new Professor("Dr.sen",0121,new Course("GE-04","SE"));
        Professor secondProfessor = new Professor("Dr.Roy",0121,new Course("GE-03","CS"));
        TeachingAssistance firstTeachingAssistance = new TeachingAssistance("Dr.Dey",2013,new Course("GE-04","SE"));
        TeachingAssistance secondTeachingAssistance = new TeachingAssistance("Dr.Mitra",201,new Course("GE-03","CS"));


        firstProfessor.AssignGrade('A',"Soujanya","SE");
        secondProfessor.AssignGrade('B',"Bhumi","CS");
        firstTeachingAssistance.assistStudents("Soujanya","SE");
        secondTeachingAssistance.assistStudents("Bhumi","CS");


    }
}
