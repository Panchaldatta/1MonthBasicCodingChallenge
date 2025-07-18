package Day6;

public class StrongNumber {
    
    // Driver code
    public static void main(String[] args) {
        int num = 145; // Example: check if 145 is a Strong Number
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is not a Strong Number");
        }
    }

    private static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }   
}
