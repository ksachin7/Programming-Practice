package interviewPractice.java;

import java.util.List;

// String-Normalization
class StringNormalization {
    public static void main(String[] args) {
        String panda = "   Panda";
        String fish = "Fish   ";
        String dog = "   Dog   ";
        String cat = "Cat";
        String nothing = "  ";

        List<String> list = List.of(panda, fish, dog, cat, nothing);

//        list.forEach(s-> System.out.println(s.trim()));

        List<String> trimmed = list.stream()
                .map(String::trim).toList();

        List<String> normalizedNames = trimmed.stream()
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase).toList();
        System.out.println("Normalized list: " + normalizedNames);
    }
}
