package Inheritance;

public class Vehicle2 {
    public String brand; // Public member
    protected int year; // Protected member
    String model; // Default (package-private) member
    private double price; // Private member

    public Vehicle2(String brand, int year, String model, double price) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.price = price;
    }

    // Public method to access private member
    public double getPrice() {
        return price;
    }

    // Protected method
    protected void displayYear() {
        System.out.println("Year: " + year);
    }

    // Default method
    void displayModel() {
        System.out.println("Model: " + model);
    }

    // Private method
    private void displayPrice() {
        System.out.println("Price: " + price);
    }

}
