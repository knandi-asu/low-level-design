package ParkingLotLLD;

public class BikePayment extends Payment{
    @Override
    public double calculateCost(double hours){
        return hours*1;
    }
}
