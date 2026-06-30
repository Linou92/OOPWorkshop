package se.lexicon.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<ParkingSpot> spots;
    private List<ParkingTicket> activeTickets;

    public ParkingLot(int numberOfSpots){
        spots = new ArrayList<>();
        activeTickets = new ArrayList<>();
        for(int i = 1; i <= numberOfSpots; i++){
            spots.add(new ParkingSpot(i));
        }
    }

    public void parkCar(Car car){
        ParkingSpot freeSpot = findFreeSpot();
        if(freeSpot == null){
            IO.println("No free parking spots available.");
            return;
        }
        freeSpot.occupySpot();
        ParkingTicket ticket = new ParkingTicket(car, freeSpot);
        activeTickets.add(ticket);
        IO.println("Car " + car.getRegNumber() + " parked at spot " + freeSpot.getSpotNumber());
    }

    public void removeCar(Car car){
        ParkingTicket ticket = null;
        for(ParkingTicket t : activeTickets){
            if(t.getCar().getRegNumber().equals(car.getRegNumber())){
                ticket = t;
                break;
            }
        }
        if(ticket == null){
            IO.println("Car " + car.getRegNumber() + " not found.");
            return;
        }
        ticket.closeTicket();
        ParkingSpot spot = ticket.getSpot();
        spot.freeSpot();
        activeTickets.remove(ticket);
        IO.println("Car " + car.getRegNumber() + " left spot " + spot.getSpotNumber() + ". Parked for: " + ticket.getDurationInMinutes() + " minutes.");
    }

    private ParkingSpot findFreeSpot(){
        for(ParkingSpot spot : spots){
            if(!spot.isOccupied()) return spot;
        }
        return null;
    }
}
