package OOPConcepts;

// Subclass Car inheriting from Vehicle
public class Car extends Vehicle {
    private int numSeats; // Attribute to store the number of seats

    // Constructor to initialize car type and number of seats
    public Car(String type, int numSeats) {
        super(type); // Call the constructor of the parent class
        this.numSeats = numSeats;
    }

    // Method to simulate honking the car horn
    public void honk() {
        System.out.println("Honking the car horn");
    }
}
