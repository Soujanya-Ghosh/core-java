package Complex_inheritance;

public class LandMammals extends Mammals{
    private String name;
    private String type;
    public LandMammals(){}

    public LandMammals(String name, String type) {
        super(name, type);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    public void legs(int num){
        System.out.println("Number of legs"+num);
    }

    @Override
    public String toString() {
        return "LandMammals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
