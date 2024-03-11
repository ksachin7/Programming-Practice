package itssachin.interviewPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class JavaConcepts {

}


// covariant return type
class SuperClass {
    SuperClass get() {
        System.out.println("SuperClass");
        return this;
    }
}
class Tester extends SuperClass {
    Tester get() {
        System.out.println("SubClass");
        return this;
    }
    public static void main(String[] args) {
        SuperClass tester = new Tester();
        tester.get();
    }
}

// String-Normalization
class StringNormalization{
    public static void main(String[] args) {
        String panda= "   Panda";
        String fish= "Fish   ";
        String dog= "   Dog   ";
        String cat= "Cat";
        String nothing= "  ";

        List<String> list= List.of(panda, fish, dog, cat, nothing);

//        list.forEach(s-> System.out.println(s.trim()));

        List<String> trimmed= list.stream()
                .map(String::trim).toList();

        List<String> normalizedNames= trimmed.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase).toList();
        System.out.println("Normalized list: "+ normalizedNames);
    }
}

// Optional
class Optional{
    public static void main(String[] args) {

    }
}

// Lambdas
class Lambdas{
    public static void main(String[] args) {

    }
}

// Stream
class Stream{
    public static void main(String[] args) {

    }
}

// Reflection
class Reflection{
    public static void main(String[] args) {

    }
}