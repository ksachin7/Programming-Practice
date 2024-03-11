package interviewPractice;
import java.util.Objects;

public class OverridingObjectMethods {

}
/**
 * A simple class representing a person with a name and an age.
 */
class Person {
    private String name;
    private int age;

    /**
     * Constructor to initialize a person with a name and an age.
     *
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Compares this person to another object to determine if they are equal.
     *
     * @param obj The object to compare to.
     * @return {@code true} if the objects are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If the objects are the same, they are equal
        if (obj == null || getClass() != obj.getClass()) return false; // Check class compatibility

        Person person = (Person) obj; // Cast the object to Person

        // Compare fields for equality
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    /**
     * Generates a hash code for this person.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Generate a hash code based on fields
    }

    /**
     * Returns a string representation of this person.
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * The main method to demonstrate the usage of the Person class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create instances of the Person class
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Print the string representations of the persons
        System.out.println(person1);
        System.out.println(person2);

        // Check if the persons are equal
        System.out.println("Are persons equal? " + person1.equals(person2));

        // Print the hash codes of the persons
        System.out.println("HashCode for person1: " + person1.hashCode());
        System.out.println("HashCode for person2: " + person2.hashCode());
    }
}
