package Composition3;

public class Student {
    private String stuName;
    private int roll;
    private Course course;

    public Student() {
    }

    public Student(String stuName, int roll) {
        this.stuName = stuName;
        this.roll = roll;
    }

    public String getStuName() {
        return stuName;
    }

    public int getRoll() {
        return roll;
    }


    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", roll=" + roll +
                '}';
    }
}

