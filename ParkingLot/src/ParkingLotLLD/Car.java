package ParkingLotLLD;

public class Car extends Vehicle{
    public Car(){
        this.payment=new CarPayment();
    }
    @Override
    public String getType(){
        return "Car";
    }
}
