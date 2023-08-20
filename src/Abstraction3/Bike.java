package Abstraction3;

public class Bike extends Vehicle{
    private boolean rentalStatus;

    public Bike() {
    }

    public Bike(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
    @Override
    public void rent(){
        if(rentalStatus=true){
            System.out.println("Bike is rented");
        }
    }
    @Override
    public void returnVehicle(){
        if(rentalStatus=false){
            System.out.println("Bike is returned");
        }else{
            System.out.println("Bike is not rented");
        }
    }
}


