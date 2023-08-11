package Composition2;

public class Door_Lock {
    private boolean is_locked;
    public Door_Lock(){
    }

    public Door_Lock(boolean is_locked) {
        this.is_locked = is_locked;
    }
    public  void lock(){
        is_locked = false;
        System.out.println("Locks the door");
    }
    public void unlock(){
        is_locked = true;
        System.out.println("Unlocks the door");
    }

    @Override
    public String toString() {
        return "Door_Lock{" +
                "is_locked=" + is_locked +
                '}';
    }
}
