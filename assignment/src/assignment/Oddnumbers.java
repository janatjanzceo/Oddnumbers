package assignment;

public class Oddnumbers {
    public static void main(String[] args) {
        // Define the range
        int start = 1;
        int end = 100;

        // Loop through the range
        for (int i = start; i <= end; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.println(i + " is an odd number.");
            } else {
                // This part is optional, just to show the use of else
                System.out.println(i + " is an even number.");
            }
        }
    }
}




