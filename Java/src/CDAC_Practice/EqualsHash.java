package CDAC_Practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class EqualsHash {
    String name;
    int id;

    EqualsHash(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        // if both the object references are referring to the same object.
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        EqualsHash eh = (EqualsHash) obj;

        // comparing the state of argument with the state of 'this' Object.
        return (eh.name.equals(this.name) && eh.id == this.id);
    }
    @Override
    public int hashCode()
    {
        return this.id;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

// Driver code
class HashMain {
    public static void main (String[] args) {
        // creating two Objects with
        // same state
        EqualsHash e1 = new EqualsHash("abc", 1);
        EqualsHash e2 = new EqualsHash("abc", 1);

        HashSet<EqualsHash> hs= new HashSet<>();
        hs.add(e1);
        hs.add(e2);

//        for(EqualsHash e : hs) {
//            System.out.println(e);
//        }
        Iterator<EqualsHash> itr= hs.iterator();
        while (itr.hasNext()){
            EqualsHash eq=itr.next();
            System.out.println(eq.toString()+" "+eq.getId());
        }

        EqualsHash e3=e2;
        System.out.println("e3: "+e3);

        System.out.println("HashCode e1 = "+e1.hashCode());
        System.out.println("Hashcode e2 = "+e2.hashCode());
        System.out.println("Hashcode e3 = "+e3.hashCode());

        System.out.println("e1 and e3  : "+e1.equals(e3));
        System.out.println("e2 and e3  : "+e2.equals(e3));
        System.out.println("e2 and e3  : "+(e2==e3));
    }
}


//
//
////Question 4:
//
//import java.util.*;
//class Employee
//{
//    private String name;
//    private int id;
//
//    public Employee(String name , int id)
//    {
//        this.name = name;
//        this.id = id;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//
//    public int getId()
//    {
//        return id;
//    }
//
//    public void setId(int id)
//    {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee [Name=" + name + ", ID=" + id + "]";
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Employee other = (Employee) obj;
//        return id == other.id && Objects.equals(name, other.name);
//    }
//
//}
//class EmployeeDemo
//{
//    public static void main(String[] args)
//    {
//        HashSet<Employee> hs = new HashSet<>();
//        Employee e1 = new Employee("Rohan",1);
//        Employee e2 = new Employee("Akash",2);
//        hs.add(e1);
//        hs.add(e2);
//
//        for(Employee e : hs)
//            System.out.println(e);
//
//        Employee e3=e2;
//        System.out.println(e3);
//
//        System.out.println("HashCode e1 = "+e1.hashCode());
//        System.out.println("Hashcode e2 = "+e2.hashCode());
//        System.out.println("Hashcode e3 = "+e3.hashCode());
//
//        System.out.println("e1 and e3  : "+e1.equals(e3));
//        System.out.println("e2 and e3  : "+e2.equals(e3));
//        System.out.println("e2 and e3  : "+(e2==e3));
//
//    }
//
//}