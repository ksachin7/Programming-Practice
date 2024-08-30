package interviewPractice.practice;

import java.util.Random;

// Random numbers
class RandomNumbers {
    public static void main(String[] args) {
        int max = 10, min = 1;
        int random = new Random().nextInt(max - min + 1) + min;
        System.out.println(random);
    }
}
