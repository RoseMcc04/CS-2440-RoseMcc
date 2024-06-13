package Week2.Exceptions;

public class App 
{
    public static void main(String[] args) throws IllegalArgumentException, 
        ExceptionsPractice
    {
        throw new ExceptionsPractice("hello");
    }

    public static void method(int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("negative number");
        }
        System.out.println("good data");
    }
}
