package OOPConcepts;

// Subclass ElectricCar inheriting from Car and implementing Maintenance interface
public class ElectricCar extends Car implements Maintenance {
    public ElectricCar(int numSeats) {
        super("Electric Car", numSeats);
    }

    // Implementation of the performMaintenance method from the Maintenance interface
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on the electric car");
    }
}
