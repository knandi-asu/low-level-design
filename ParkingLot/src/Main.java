import ParkingLotLLD.Bike;
import ParkingLotLLD.Car;
import ParkingLotLLD.Vehicle;

public class Main{
    public static void main(String[] args){
        ParkingLot parkingLot=new ParkingLot(3, 10, 20);
        Car v1=new Car();
        Bike v2=new Bike();

        v1.setParkedTime();
        v2.setParkedTime();

        parkingLot.park(v1, 0, 0, 0);
        parkingLot.park(v2, 0, 0, 0);

        System.out.println("Available spots in floor 0 : " + parkingLot.availbleSpots(0));

        parkingLot.leave(v1);
        parkingLot.leave(v2);

        System.out.println("Available spots in floor 0 : " + parkingLot.availbleSpots(0));


    }
}