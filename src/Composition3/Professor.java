package Composition3;

public class Professor extends Faculty{
    private Course course;
   // private char grade;
    public Professor(){}



    public Professor(String name, int id, Course course) {
        super(name, id, course);

    }
    public void AssignGrade(char grade,String stuName, String tittle){
        System.out.println(getName() + getId() + " assign grade " + grade + " to " + stuName + " in " + tittle);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "course=" + course +
                "name="+super.getName()+
                "id="+super.getId()+
                '}';
    }
}


