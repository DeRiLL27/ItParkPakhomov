package Lesson3;

public class Factorial {
    public static void main(String[] args) {
        // n!
        System.out.println(factorial(5));
    }
    private static int factorial(int n) {
        if(n ==1) return 1; // Base step
        return n * factorial(n-1); // Recursive step
    }
}
