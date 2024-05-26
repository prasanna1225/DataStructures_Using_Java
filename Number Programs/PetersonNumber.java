package petersonnumber;

import java.util.Scanner;

public class PetersonNumber {

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  
        int originalNum = num; // Store original number for comparison
        int sum = 0;

        while (num > 0) {
            int rem = num % 10; // Get the last digit
            sum += factorial(rem); // Add factorial of the digit to sum
            num /= 10; // Remove the last digit
        }

        // Check if sum of factorials equals the original number
        if (sum == originalNum) {
            System.out.println("Peterson Number");
        } else {
            System.out.println("Not Peterson Number");
        }

        sc.close(); // Close the scanner
    }
}


