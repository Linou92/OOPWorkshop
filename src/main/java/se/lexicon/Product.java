package se.lexicon;

public class Product {

    private String name;
    private double price;

    Product(String name, double price) {
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Product name cannot be null or blank");
        }
        if(price < 0){
            throw new IllegalArgumentException("Product price cannot be negative");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    private void applyDiscount(double percent) {
        if(percent < 0 || percent > 80){
            throw new IllegalArgumentException("Discount must be between 0 and 80%");
        }
        price -= (price * percent) / 100;
    }

    public void printInfo() {
        IO.println("Product name is " + name + " and its current price is " + price + " SEK");
    }
}
