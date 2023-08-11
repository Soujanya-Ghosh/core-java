package Complex_inheritance;

public class WaterMammals {
    private String name;
    private String type;
    public WaterMammals(){}

    public WaterMammals(String name, String type) {
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

    @Override
    public String toString() {
        return "WaterMammals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
