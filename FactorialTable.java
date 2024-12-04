import java.util.Scanner;

public class FactorialTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the range of the table
        System.out.print("Enter the maximum number for the factorial table: ");
        int limit = scanner.nextInt();

        System.out.println("\nFactorial Table");
        System.out.println("----------------------------");
        System.out.printf("%-10s %-20s\n", "Number", "Factorial");
        System.out.println("----------------------------");

        for (int i = 1; i <= limit; i++) {
            System.out.printf("%-10d %-20d\n", i, factorial(i));
        }
    }

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
