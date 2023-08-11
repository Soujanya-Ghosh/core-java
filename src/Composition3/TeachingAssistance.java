package Composition3;

public class TeachingAssistance extends Faculty {
    private Course course;
    public TeachingAssistance(){}



    public TeachingAssistance(String name, int id, Course course) {
        super(name, id, course);
    }
public void assistStudents(String stuName, String tittle){
    System.out.println(getName() + getId() + " assists " + stuName + " in " + tittle );

}

    @Override
    public String toString() {
        return "TeachingAssistance{" +
                "course=" + course +
                "Faculty="+super.getName()+
                "Faculty="+super.getId()+
                '}';
    }
}

