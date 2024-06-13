package Week1.Arrays2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading 
{
    private int[][] array;
    private final int WIDTH = 4;
    private final int HEIGHT = 3;

    /*
     * check if number in file is positive or negative.
     * if positive, write 0 to current index
     * if negativfe, write 1 to current index
     */
    public void readFile() throws FileNotFoundException
    {
        array = new int[HEIGHT][WIDTH];
        File f = new File("Arrays2D/numbers.txt");
        Scanner kb = new Scanner(f);
        for (int i = 0; i < HEIGHT; i++) 
        {
            for (int j = 0; j < WIDTH; j++) 
            {
                int val = kb.nextInt();
                array[i][j] = val;
            }
        }
        kb.close(); // ALWAYS CLOSE SCANNERS!
    }

    public void print() 
    {
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++) 
            {
                System.out.println(array[i][j] + " ");
            }
        }
    }
}
