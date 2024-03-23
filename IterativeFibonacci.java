import java.util.Scanner;

public class IterativeFibonacci {

    // Iterative Fibonacci function
    public static int fibonacciIterative(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

   
    // Main method for accepting user input and testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for Fibonacci calculation: ");
        int input = scanner.nextInt();

        // Calculate Fibonacci values
        int iterativeResult = fibonacciIterative(input);
       

        // Display results
        System.out.println("Iterative Fibonacci for " + input + " : " + iterativeResult);
    

        // Close scanner
        scanner.close();
    }
}

