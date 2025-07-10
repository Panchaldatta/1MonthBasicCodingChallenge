package Day2;

public class LeapYear{
    public static void main(String[] args) {
        int year = 2020; // Example year

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // Using Ternary Operator
        // String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
        // System.out.println(year + " is " + result + ".");
    }   
}