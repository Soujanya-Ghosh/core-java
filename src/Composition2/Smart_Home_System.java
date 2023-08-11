package Composition2;

public class Smart_Home_System {
    public static void main(String[] args) {


       
    }
    
        Light light1 = new Light();
        Thermostat tempThermostat = new Thermostat((float) 0);
        Door_Lock digitalLock = new Door_Lock();
        Security_Camera security = new Security_Camera();
        public void turn_on_all_lights(){
            light1.turn_off();

    }
    public void turn_off_all_lights(){
            light1.turn_on();
    }
    public void setTempThermostat(){
            tempThermostat.setTemperature(31.2F);
    }
    public void start_security_camera_recording_on(){
            security.start_recording();
    }
    public void stop_security_camera_recording(){
            security.stop_recording();
    }
    public void lock_all_doors(){
            digitalLock.lock();
    }
    public void unlock_doors(){
            digitalLock.unlock();
    }
}
