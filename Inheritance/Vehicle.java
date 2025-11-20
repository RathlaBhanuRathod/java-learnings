package Inheritance;
/*
 Vehicle class (Parent class) contains fields brand and year and a constructor to initialize these fields. Method displayInfo() prints the brand and year of the vehicle.
 */
public class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
