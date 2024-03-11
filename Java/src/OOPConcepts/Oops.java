package OOPConcepts;

/**
 * In this example:
 * <ul>
 * <li><b>Class:</b> We have the base class {@code Vehicle}, demonstrating class creation.</li>
 * <li><b>Object:</b> We create instances of {@code Vehicle}, {@code Car}, and {@code ElectricCar} classes using the {@code new} keyword.</li>
 * <li><b>Inheritance:</b> The {@code Car} class inherits from the {@code Vehicle} class, inheriting its methods and attributes.</li>
 * <li><b>Encapsulation:</b> The {@code type} attribute in the {@code Vehicle} class is encapsulated by using private access and a public constructor.</li>
 * <li><b>Polymorphism:</b> The {@code drive} method is overridden in both the {@code Car} and {@code ElectricCar} classes to exhibit polymorphic behavior.</li>
 * <li><b>Interface:</b> The {@code Maintenance} interface defines a contract for the {@code performMaintenance} method.</li>
 * <li><b>Implementing Interface:</b> The {@code ElectricCar} class implements the {@code Maintenance} interface.</li>
 * <li><b>Abstraction:</b> We use abstraction to create a generic concept of a "Vehicle" without specifying the details of each vehicle type. <br> The Vehicle class represents an abstraction for the concept of any vehicle. It provides a concrete implementation of the drive method, which is common to all vehicles. Even though the Vehicle class is not abstract, it can still be considered an abstraction as it defines a general behavior and serves as a base for more specific vehicle types.</li>
 * </ul>
 * When you run the {@code main} method, you'll see output demonstrating the behavior of different classes and their interactions.
 */

// Main class to demonstrate OOP features
public class Oops {
    public static void main(String[] args) {
        // Creating instances of different classes
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        vehicle.drive(); // Driving the generic vehicle

        System.out.println();

        Car car = new Car("Sedan", 5);
        car.drive(); // Driving the car
        car.honk(); // Honking the car horn

        System.out.println();

        ElectricCar electricCar = new ElectricCar(4);
        electricCar.drive(); // Driving the electric car
        electricCar.performMaintenance(); // Performing maintenance on the electric car
    }
}
