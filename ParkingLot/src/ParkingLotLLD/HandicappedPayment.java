package ParkingLotLLD;

public class HandicappedPayment extends Payment{
    @Override
    public double calculateCost(double hours){
        return 0;
    }
}
