package itssachin.assignments3;

public class HandlingNegativeArraySize {
    public static void main(String[] args) {
        try {
            int[] array = new int[-5];
        } catch (NegativeArraySizeException nase) {
            nase.printStackTrace();
            //handle the exception
        }
        System.out.println("Continuing execution...");
    }
}
