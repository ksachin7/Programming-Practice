// Class definition
public class ExampleClass {

    // Field (Instance Variable)
    private int number;

    // Constructor
    public ExampleClass(int number) {
        this.number = number;
    }

    // Method
    public void displayNumber() {
        System.out.println("Number: " + number);
    }

    // Static Field (Class-level variable)
    public static String staticField = "This is a static field.";

    // Static Method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Nested Class (Static nested class)
    public static class NestedClass {
        // Nested class definition
    }

    // Inner Class (Non-static nested class)
    public class InnerClass {
        // Inner class definition
    }

    // Static Initializer Block
    static {
        System.out.println("Static initializer block executed.");
    }

    // Instance Initializer Block
    {
        System.out.println("Instance initializer block executed.");
    }

    // Inheritance (Extends another class)
    public class SubClass extends AnotherClass {
        // SubClass definition
    }

    // Interface Implementation
    public class MyClass implements MyInterface {
        // Class implementation of methods in MyInterface
    }

    // Annotation
    @MyAnnotation
    public void annotatedMethod() {
        // Method definition
    }

    // Enumeration
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Access Modifier (Default access)
    int defaultAccessField;

    // Access Modifier (Public access)
    public int publicAccessField;

    // Access Modifier (Private access)
    private int privateAccessField;

    // Access Modifier (Protected access)
    protected int protectedAccessField;

    public static void main(String[] args) {
        // Class loading and static initializer block execution
        System.out.println("Before creating objects.");

        // Create the first object
        ExampleClass obj1 = new ExampleClass(10);

        // Create the second object
        ExampleClass obj2 = new ExampleClass(20);

        // Call an instance method on the first object
        obj1.displayNumber();

        // Call a static method
        staticMethod();

        // Access static field
        System.out.println("Static field value: " + staticField);

        // Access instance fields
        System.out.println("obj1 instance field value: " + obj1.number);
        System.out.println("obj2 instance field value: " + obj2.number);

        for(Days day: Days.values()){
            System.out.print(day+ " ");
        }

        System.out.println("\nAfter creating objects.");
    }

}

// Another class for inheritance example
class AnotherClass {
    // Another class definition
}

// Interface for interface implementation example
interface MyInterface {
    // Method signatures
}

// Annotation definition
@interface MyAnnotation {
    // Annotation elements
}
