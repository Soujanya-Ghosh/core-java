package Composition3;

public class Course {
    private String courseCode;
    private String tittle;

    public Course() {
    }

    public Course(String courseCode, String tittle) {
        this.courseCode = courseCode;
        this.tittle = tittle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void enrollStudents(String stuName,int roll){
        System.out.println("Enrolled student name is " +stuName+ " Course is " +  tittle  + " Course code is "+ courseCode);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}


