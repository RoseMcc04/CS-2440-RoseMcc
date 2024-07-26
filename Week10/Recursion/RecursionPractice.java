package Week10.Recursion;

/**
 * @author Rose McCormack
 * @version 30 July 2024
 */
public class RecursionPractice 
{
    /**
     * @param args This is the main method where we will execute all of the
     * recursion applications. 
     */
    public static void main(String[] args) 
    {
        // Static method executed within own class does not need class 
        // specification for execution.
        writeVertical(45);

        // Static method executed within own class does not need class 
        // specification for execution.
        System.out.println(seenThisBefore(233, 11));
    }

    /**
     * @param number The number inputted will only be printed one digit at a
     * time. For instance, since 45 > 10, we would write vertical for the 
     * number divided by 10 and repeat the process depending on the digits. 
     * Then, each subsequent digit is printed. 
     */
    public static void writeVertical(int number) 
    {
        if (number < 10) 
        {
            System.out.println(number);
        }
        else 
        {
            writeVertical(number / 10);
            System.out.println(number % 10);
        }
    }

    /**
     * @param n Number desired to be converted
     * @param b Base system param n is converted into
     * @return This method returns an integer representation of a number based
     * on the number base. 
     */
    public static String seenThisBefore(int n, int b) 
    {
        String digit = "0123456789ABCDEF";
        if (b > n) 
        {
            return "" + digit.charAt(n);
        }
        else 
        {
            return "" + seenThisBefore(n / b, b) + digit.charAt(n % b);
        }
    }
}
