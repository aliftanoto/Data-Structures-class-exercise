import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive Fibonacci function
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    // Main method for accepting user input and testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for Fibonacci calculation: ");
        int input = scanner.nextInt();

        // Calculate Fibonacci values
        int recursiveResult = fibonacciRecursive(input);

        // Display results
        System.out.println("Recursive Fibonacci for " + input + " : " + recursiveResult);

        // Close scanner
        scanner.close();
    }
}