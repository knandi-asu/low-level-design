package ParkingLotLLD;

public class HandicappedVehicle extends Vehicle{
    public HandicappedVehicle(){
        this.payment=new HandicappedPayment();
    }
    @Override
    public String getType(){
        return "HandicappedVehicle";
    }
}
