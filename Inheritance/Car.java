package Inheritance;

/*
 Car class (Child class) inherits from Vehicle. 
 This contains an additional field mileage. 
 The constructor of the Car class initializes the brand and year using the super keyword and also initializes mileage. 
 It also has a method displayMileage() to print the mileage of the car.
 */
public class Car extends Vehicle {
    int mileage;

    public Car(String brand, int year, int mileage) {
        super(brand, year);
        this.mileage = mileage;
    }

    public void displayMileage() {
        System.out.println("Mileage: " + mileage + " km/l");
    }
    
}
