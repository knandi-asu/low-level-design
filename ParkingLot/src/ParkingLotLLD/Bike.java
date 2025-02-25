package ParkingLotLLD;

public class Bike extends Vehicle{
    public Bike(){
        this.payment=new BikePayment();
    }
    @Override
    public String getType(){
        return "Bike";
    }
}
