package Week1.Arrays2D;

public class FurtherArrayPractice 
{
    /*
     * THIS IS FOR PRACTICE ONLY. ALL METHODS ARE STATIC SO THEY CANNOT BE USED
     * IN OTHER CLASSES.
     */

    /**
     * @param matrix This is the multi-dimensional array that will be put through
     * the method.
     * @return The return is the amount of positive integers in the matrix.
     */
    public static int countPositives(int[][] matrix) 
    {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] > 0) 
                {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * @param matrix This is the multi-dimensional array that will be put through the 
     * method.
     * @return The return is a print of an actual matrix of integers.
     */
    public static String formMatrix(int[][] matrix) 
    {
        String s = "";
        for (int i = 0; i < matrix.length; i++) 
        {
            int mean = 0; // Reset mean for each new row
            for (int j = 0; j < matrix[i].length; j++) 
            {
                mean += matrix[i][j];
                s += matrix[i][j] + " ";
                if (j + 1 == matrix[i].length) 
                {
                    double rowMean = (double) mean / matrix[i].length; // Calculate rowMean after summing up elements
                    s += String.format("%.1f\n", rowMean);
                }
            }
        }
        return s;
    }

    public static boolean isValid(int[][] arr, int i, int j) 
    {
        return i >= 0 && i < arr.length && // Checks if i is valid
            j >= 0 && j < arr[i].length; // Checks if j is valid
    }

    /**
     * 
     * @param arr This is the 2D array input of integers.
     * @return The returned value will be the number of zeroes that do not have 
     * neighbors that are zeroes.
     */
    public static int countIsolatedZeroes(int[][] arr) 
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if (arr[i][j] == 0) 
                {
                    if (isValid(arr, i - 1, j) == false && arr[i - 1][j] == 0) 
                    {
                        continue;
                    }
                    if (isValid(arr, i + 1, j) == false && arr[i + 1][j] == 0) 
                    {
                        continue;
                    }
                    if (isValid(arr, i, j - 1) == false && arr[i][j - 1] == 0) 
                    {
                        continue;
                    }
                    if (isValid(arr, i, j + 1) == false && arr[i][j + 1] == 0) 
                    {
                        continue;
                    }
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * @param args This is the main method where we execute everything.
     */
    public static void main(String[] args) 
    {
        int[][] table = {{36, 41, 36}, {28, 43, 38}, 
        {17, 39, 32}};

        System.out.println();
        System.out.println(countPositives(table));
        System.out.println();
        System.out.println();
        System.out.println(formMatrix(table));
    }
}
