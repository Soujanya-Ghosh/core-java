package Composition2;

public class Security_Camera {
    private boolean is_recording;
    public Security_Camera(){

    }

    public Security_Camera(boolean is_recording) {
        this.is_recording = is_recording;

    }
    public void start_recording(){
        is_recording = true;
        System.out.println("Starts recording with the security camera");
    }
    public void stop_recording()
    {
        is_recording = false;
        System.out.println("Stop recording with the security camera");
    }

    @Override
    public String toString() {
        return "Security_Camera{" +
                "is_recording=" + is_recording +
                '}';
    }
}
