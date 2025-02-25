import ParkingLotLLD.HandicappedVehicle;
import ParkingLotLLD.Vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingLot {
    private Vehicle[][][] spots;
    private int floors;
    private int rows;
    private int spotsPerRow;

    public ParkingLot(int floors, int rows, int spotsPerRow){
        this.floors=floors;
        this.rows=rows;
        this.spotsPerRow=spotsPerRow;
        this.spots=new Vehicle[floors][rows][spotsPerRow];
    }

    public boolean park(Vehicle v, int floor, int row, int spot){
        if(spots[floor][row][spot]==null) {
            spots[floor][row][spot] = v;
            v.setParkedTime();
            System.out.println(v.getType() + " successfully parked at floor : " + floor);
            return true;
        }else{
            System.out.println("Position is already occupied");
            return false;
        }
    }

    public boolean leave(Vehicle v){
        for(int i=0;i<floors;i++){
            for(int j=0;j<rows;j++){
                for(int k=0;k<spotsPerRow;k++){
                    if(spots[i][j][k]==v){
                        double hours=calculateHoursParked(v);
                        double cost=v.calculateCost(hours);
                        System.out.println(v.getType()+" left the parking space succesfully");
                        spots[i][j][k]=null;
                        return true;
                    }
                }
            }
        }
        System.out.println("No vehicle as such");
        return false;
    }

    public double calculateHoursParked(Vehicle v){
        LocalDateTime parkedTime=v.getParkedTime();
        Duration duration=Duration.between(parkedTime, LocalDateTime.now());
        return duration.toHours();
    }

    public int availbleSpots(int floor){
        int cnt=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<spotsPerRow;j++){
                if(spots[floor][i][j]==null){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int handicappedSpots(int floor){
        int cnt=0;
        for(int i=0;i<floors;i++){
            for(int j=0;j<spotsPerRow;j++){
                if(spots[floor][i][j] instanceof HandicappedVehicle){
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
