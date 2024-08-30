package CDAC_Practice;
import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        // create an array list to store Integer data
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        System.out.println("ArrayList of Integer: " + list1);

        // creates an array list to store String data
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Four");
        list2.add("Five");
        System.out.println("ArrayList of String: " + list2);

        // creates an array list to store Double data
        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(4.5);
        list3.add(6.5);
        System.out.println("ArrayList of Double: " + list3);
    }

}

class MyClass<T> {
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    MyClass(T o) {
        ob = o;
    }

    // Return ob.
    T getValue() {
        return ob;
    }
}

// A subclass of MyClass that defines a second
// type parameter, called V.
class MyClass2<T, V> extends MyClass<T> {
    V ob2;

    MyClass2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getValue2() {
        return ob2;
    }
}

// Create an object of type MyClass2.
class GenericMain {
    public static void main(String args[]) {

        // Create a MyClass2 object for String and Integer.
        MyClass2<String, Integer> x =
                new MyClass2<String, Integer>("Value is: ", 99);

        System.out.print(x.getValue());
        System.out.println(x.getValue2());
    }
}