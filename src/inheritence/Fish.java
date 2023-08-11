package inheritence;

public class Fish extends Animal{
    private int fins;
    private int gills;
    public Fish(){}

    public Fish(int fins, int gills) {
        this.fins = fins;
        this.gills = gills;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public int getGills() {
        return gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }
    public void moveMuscles(){
        System.out.println("This " + this.getType() + "move muscles");
    }
    public void moveBackFins(){
        System.out.println("This " + this.getType() + "move back fins");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                '}';
    }
}

