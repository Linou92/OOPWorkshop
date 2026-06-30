package se.lexicon;


import se.lexicon.OnlineShop.OnlineShopApp;
import se.lexicon.ParkingLot.ParkingLotApp;

public class Main {
    static void main() {

        IO.println(String.format("""
                =============================================
                |               ONLINE SHOP APP             |
                =============================================
                """));
        OnlineShopApp.runApp();

        IO.println(String.format("""
                =============================================
                |               PARKING LOT APP             |
                =============================================
                """));
        ParkingLotApp.runApp();
    }
}
