package inheritence;

public class Animal {

private String size;
private String type;
private double weight;
public Animal (){}

    public Animal(String size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void move(String speed){
        System.out.println("This" + this.type + " moves" + speed);
    }
    public void makeNoise(){
        System.out.println("This " + this.type + " makes noise");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}



