package OOPConcepts;

// Base class representing a Vehicle
public class Vehicle {
    private String type; // Attribute to store the type of vehicle

    // Constructor to initialize the vehicle type
    public Vehicle(String type) {
        this.type = type;
    }

    // Method to simulate driving the vehicle
    public void drive() {
        System.out.println("Driving the " + type);
    }
}
