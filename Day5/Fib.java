package Day5;

public class Fib {

    // Driver code
    public static void main(String[] args) {
        int n = 10; // Example: first 10 Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
}
