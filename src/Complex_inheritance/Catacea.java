package Complex_inheritance;

public class Catacea extends Carnivora{
    private String size;
    private String type;
    private double weight;
    public Catacea(){}

    public Catacea(String size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
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

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Catacea{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
