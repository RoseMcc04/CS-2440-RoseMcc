package Week2.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FurtherPractice 
{
    
    /*
     * 
     * using try-catch-finally
     * try: to open a file to read
     *      and then read a line
     * catch: FileNotFoundException
     *        check if file is empty
     *            throw an IOException
     *        then read a line
     * finally: close scanner
     */

     public static void main(String[] args) throws IOException 
     {
        Scanner sc = null;
        try 
        {
            File f = new File("Week2/Exceptions/Demo.txt");
            sc = new Scanner(f);
            if (!sc.hasNext()) 
            {
                throw new IOException("I/O Exception found");
            }
            System.out.println(sc.nextLine());
        }
        catch (FileNotFoundException e) 
        {
            System.out.println(e);
        }
        finally 
        {
            System.out.println("Done with this exercise");
            sc.close();
        }
     }
}
