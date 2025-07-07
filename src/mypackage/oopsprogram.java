package mypackage;

abstract class Vehicle {
    private String brand;
    private String model;
    private int cost;

    //constructor
    public Vehicle(String brand, String model, int cost) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
    }

    //getter
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

    //abstract method
    public abstract int calculateTax();
}

class Car extends Vehicle {
    private int seat;
    private String fuel;

    //constructor
    public Car(String brand, String model, int cost, int seat) {
        this(brand, model, cost, seat, "petrol"); //constructor chaining
    }

 
    public Car(String brand, String model, int cost, int seat, String fuel) {
        super(brand, model, cost); //super keyword
        this.seat = seat;
        this.fuel = fuel;
    }

    //getter
    public int getSeat() {
        return seat;
    }

    public String getFuel() {
        return fuel;
    }

    
    //overriding
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seat + ", Fuel: " + fuel);
    }

    //overriding
    @Override
    public int calculateTax() {
        int baseTax = (int)(getPrice() * 0.1); 
        if (fuel.equals("diesel")) {
            baseTax += 5000;
        }
        return baseTax;
    }
}

public class oopsprogram {
    public static void main(String[] args) {
    	
        Car car1 = new Car("Maruti", "Swift", 600000, 5); //object 1
        Car car2 = new Car("Hyundai", "Creta", 1000000, 7, "diesel"); //object 2

        car1.displayInfo();
        System.out.println("Tax: " + car1.calculateTax());

        System.out.println();

        car2.displayInfo();
        System.out.println("Tax: " + car2.calculateTax());
    }
}
