package Week1.Arrays2D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) throws Exception
    {
        Reading obj = new Reading();
        obj.readFile();
        obj.print();
    }   
}