package Abstraction3;

public class Car extends Vehicle{
    private boolean rentalStatus;
   public  Car(){
   }
    public Car(boolean rentalStatus) {
        this.rentalStatus = rentalStatus;
    }
    @Override
    public void rent(){
        if(rentalStatus=true){
            System.out.println("Car is rented");
        }
    }
    @Override
    public void returnVehicle(){
        if(rentalStatus=false){
            System.out.println("Car is returned");
        }else{
            System.out.println("Car was not rented");
        }
    }
}
