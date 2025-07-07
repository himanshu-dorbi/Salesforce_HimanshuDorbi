package mypackage;

abstract class Vehicle {
    private String brand;
    private String model;
    private int cost;

    public Vehicle(String brand, String model, int cost) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return cost;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + cost);
    }

    // Abstract method to calculate tax for vehicle
    public abstract int calculateTax();
}

class Car extends Vehicle {
    private int seat;
    private String fuel;

    // Constructor with default fuel as petrol
    public Car(String brand, String model, int cost, int seat) {
        this(brand, model, cost, seat, "petrol");
    }

    // Constructor with fuel type
    public Car(String brand, String model, int cost, int seat, String fuel) {
        super(brand, model, cost);
        this.seat = seat;
        this.fuel = fuel;
    }

    public int getSeat() {
        return seat;
    }

    public String getFuel() {
        return fuel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seat + ", Fuel: " + fuel);
    }

    // Simple tax calculation based on cost and fuel type
    @Override
    public int calculateTax() {
        int baseTax = (int)(getPrice() * 0.1); // 10% of price
        if (fuel.equalsIgnoreCase("diesel")) {
            baseTax += 5000;  // Extra tax for diesel cars
        }
        return baseTax;
    }
}

public class oopsprogram {
    public static void main(String[] args) {
        Car car1 = new Car("Maruti", "Swift", 600000, 5);
        Car car2 = new Car("Hyundai", "Creta", 1000000, 7, "diesel");

        car1.displayInfo();
        System.out.println("Tax: " + car1.calculateTax());

        System.out.println();

        car2.displayInfo();
        System.out.println("Tax: " + car2.calculateTax());
    }
}
