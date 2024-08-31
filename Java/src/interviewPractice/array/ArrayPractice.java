package interviewPractice.array;

import java.util.Arrays;
import java.util.List;

class ArrayPractice {
    public static void main(String[] args) {
        int[][] arr = {{0, 3, 5}, {1}};
        int[][] arr1 = new int[][]{{0, 3, 5, 2, 5, 3}, {1, 3, 4, 5}};

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepHashCode(arr1));


        int[] arr0 = {5, 7, 6, 6, 3};
        int[] arrr = {5, 7, 6, 4, 3};
        Integer[] arr2 = new Integer[]{5, 7, 6, 6, 3};

        // compare() returns -1 in output when arr0 is lexicographically less than arrr.
        // compare() returns 1 in output when arr0 is lexicographically greater than arrr.
        // compare() returns 0 in output when arr0 is equal to arrr in size and has elements.
        System.out.println(Arrays.compare(arr0, arrr));

        System.out.println("Printing mismatch: "+Arrays.mismatch(arr0, arrr));    // returning index: 3
        Arrays.sort(arr0, 3, 5);    // Sorts the specified range of array in ascending order.
        System.out.println(Arrays.toString(arr0));

        Arrays.fill(arr0, 6);
        Arrays.fill(arr0, 1, 3, 7);
        System.out.println("Printing filled array: "+Arrays.toString(arr0));

        System.out.println(Arrays.toString(Arrays.copyOf(arr0, 4)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr0, 1, 3)));

        System.out.println(Arrays.asList(2, 4, 5, 3, 7));
        System.out.println(List.of(arr0));  // [[I@2f92e0f4] List.of() requires an Integer array not an int array

        Integer[] array = new Integer[]{1, 2, 3};
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);
        array[0] = 1000;
        System.out.println(list);

        // List.of() doesn't allow null values and it creates immutable array
        String[] str = new String[]{"one", "two", "three"};
        List<String> list1 = List.of(str);
        System.out.println(list1);
        str[0] = "thousand";
        System.out.println(list1);

        System.out.println("arr2: " + Arrays.hashCode(arr2) + "\t arr0: " + Arrays.hashCode(arr0));
        System.out.println(Arrays.equals(arr0, arrr));
        System.out.println(Arrays.binarySearch(arr0, 6));
        System.out.println(Arrays.spliterator(arrr));

        Boolean[] bools = new Boolean[]{true, false, true, true};
    }
}
