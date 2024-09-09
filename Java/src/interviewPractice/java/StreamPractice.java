package interviewPractice.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {
        // Create an array of Strings
        String[] arr = {"a", "b", "c"};

        // Convert array to Stream
        Stream<String> stream = Arrays.stream(arr);

        // Print the Stream (shows internal representation)
        System.out.println("Stream: "+stream);  // Stream: java.util.stream.ReferencePipeline$Head@7a81197d
        stream.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // Convert List to Stream
        List<String> list = Arrays.asList("a", "b", "c", "ab", "aac");
        Stream<String> stream1 = list.stream();

        // Filter elements that start with "a" and collect them into an unmodifiable list
        List<String> result = list.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toUnmodifiableList());

        // Split each string in the list into its characters, flatten them into a single Stream, and collect into an unmodifiable list
        List<String> result2 = list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toUnmodifiableList());

        // Generate an infinite Stream of integers, starting from 0 and incrementing by 2, limiting to 10 elements
        Stream<Integer> stream2 = Stream.iterate(0, n -> n + 2).limit(10);

        // Map each string in the list to its length and collect into an unmodifiable list
        List<Integer> result1 = list.stream()
                .map(String::length)
                .collect(Collectors.toUnmodifiableList());

        // Remove duplicates, sort, and collect into a modifiable list
        List<String> distinctSortedList = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        // Calculate the sum of lengths of all strings in the list
        int sum = list.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

        // Print each element using peek and collect into a list (primarily used for debugging)
        list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        // Filter strings containing "a", convert them to uppercase, sort, and collect into a list
        List<String> result3 = list.stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        // Print each element of result3
        result3.forEach(System.out::println);

        // Convert the Stream back into an array
        String[] array = list.stream().toArray(String[]::new);

        // Check if any element starts with "a"
        boolean anyMatch = list.stream().anyMatch(s -> s.startsWith("a"));

        // Count the number of elements in the stream
        long count = list.stream().count();

        // Find the first element in the stream
        Optional<String> first = list.stream().findFirst();

        // Create a parallel stream from the list
        Stream<String> parallelStream = list.parallelStream();

        // Create another parallel stream using stream().parallel()
        Stream<String> parallelStream2 = list.stream().parallel();

        // Read lines from a file and process them in a stream (Example: file.txt)
        try (Stream<String> stream3 = Files.lines(Paths.get("file.txt"))) {
            // You can process the lines here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
