package Inheritance;

public class Car2 extends Vehicle2 {
    int mileage;

    public Car2(String brand, int year, String model, double price, int mileage) {
        super(brand, year, model, price);
        this.mileage = mileage;
    }

    void displayCarInfo() {
        System.out.println("Brand: " + brand); // Public: accessible
        System.out.println("Year: " + year); // Protected: accessible
        System.out.println("Model: " + model); // Default: accessible within the same package
        // System.out.println("Price: " + price); // Private: not accessible directly
        System.out.println("Mileage: " + mileage);
    }

}
