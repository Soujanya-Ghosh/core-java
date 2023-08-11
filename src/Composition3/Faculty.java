package Composition3;

public class Faculty {
    private String name;
    private int id;
    private Course course;
    public Faculty(){}

    public Faculty(String name, int id, Course course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course=" + course +
                '}';
    }
}
