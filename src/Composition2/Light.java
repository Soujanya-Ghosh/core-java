package Composition2;

public class Light {
    private boolean is_on;
    public Light(){
    }

    public Light(boolean is_on) {
        this.is_on =is_on;
    }


    public void turn_on(){
        is_on = true;
        System.out.println("Turns the light on");
    }
    public void turn_off()
    {
        is_on = false;
        System.out.println("Turns the light off");
    }

    @Override
    public String toString() {
        return "Light{" +
                "is_on=" + is_on +
                '}';
    }
}