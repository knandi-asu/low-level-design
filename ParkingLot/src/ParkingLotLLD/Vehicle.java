package ParkingLotLLD;

import java.time.LocalDateTime;

abstract public class Vehicle {

    protected LocalDateTime parkedTime;
    protected Payment payment;


    public abstract String getType();


    public double calculateCost(double hours){
        return payment.calculateCost(hours);
    }
    public void setParkedTime() {
        this.parkedTime = LocalDateTime.now();
    }
    public LocalDateTime getParkedTime(){
        return this.parkedTime;
    }
}
