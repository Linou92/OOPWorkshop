package se.lexicon.ParkingLot;

public class ParkingLotApp {

    public static void runApp() {

        ParkingLot lot = new ParkingLot(3);

        Car c1 = new Car("ABC123");
        Car c2 = new Car("DEF456");
        Car c3 = new Car("GHI789");
        Car c4 = new Car("JKL321");

        lot.parkCar(c1);
        lot.parkCar(c2);
        lot.parkCar(c3);

        lot.parkCar(c4); // full

        lot.removeCar(c1);

        lot.parkCar(c4);
    }
}
