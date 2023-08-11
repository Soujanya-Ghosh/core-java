package Complex_inheritance;

public class Mammals {
    private String name;
    private String type;
    public Mammals(){}

    public Mammals(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void move(String speed){
        System.out.println("This" +getType()+ "moves" +speed);
    }
    public void eat(){
        System.out.println("This"+getType()+"eats");
    }
    public void sound(){
        System.out.println("This"+getType()+"sounds");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
