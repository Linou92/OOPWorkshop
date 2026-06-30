package se.lexicon.ParkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingTicket {

    private Car car;
    private ParkingSpot spot;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;

    public ParkingTicket(Car car, ParkingSpot spot) {
        this.car = car;
        this.spot = spot;
        this.arrivalTime = LocalDateTime.now();
    }

    public Car getCar() {
        return car;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public void closeTicket(){
        this.departureTime = LocalDateTime.now();
    }

    public long getDurationInMinutes(){
        if(departureTime == null) return 0;
        return Duration.between(arrivalTime, departureTime).toMinutes();
    }
}
