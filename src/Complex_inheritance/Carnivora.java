package Complex_inheritance;

public class Carnivora extends LandMammals{
    private String size;
    private String type;
    private double weight;
    public Carnivora(){}


    public Carnivora(String name, String type, String size, String type1, double weight) {
        this.size = size;
        this.type = type1;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void move(String speed){
        System.out.println("This " + this. type + " moves" + speed);
    }
    public void makeNoise(String noise){
        System.out.println("This " + this. type + " makes noise " + noise);
    }

    @Override
    public String toString() {
        return "Carnivora{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
