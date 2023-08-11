package Composition2;

public class Thermostat {
    private float temperature;
    public Thermostat(){}

    public Thermostat(float temperature) {
        this.temperature = temperature;
    }


    public void setTemperature(float temperature) {
        this.temperature = temperature;
        System.out.println("Sets the desired temperature on thermostat" +temperature);

    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "temperature=" + temperature +
                '}';
    }
}
