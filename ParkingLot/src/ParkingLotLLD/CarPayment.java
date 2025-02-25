package ParkingLotLLD;

public class CarPayment extends Payment{
    @Override
    public double calculateCost(double hours){
        return hours*2;
    }

}
