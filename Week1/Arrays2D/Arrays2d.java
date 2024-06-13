package Week1.Arrays2D;

import java.util.Random;

public class Arrays2d 
{
    // This lesson was on 2-D arrays, but the class example used a 3 x 4 matrix.

    int[][] nums = new int[3][4];

    int sum = 0;

    /**
     * This method does not return anything and will generate numbers between 0 and 50
     * for our multi-dimensional array.
     */
    public void gatherNums() 
    {
        
    }
    /**
     * @return This method returns the sum of a 3 x 4 array.
     */
    public int sumLoop() 
    {
            gatherNums();
            for (int i = 0 ; i < nums.length; i++) 
        {
            for (int j = 0 ; j < nums[i].length; j++) 
            {
                sum += nums[i][j];
            }
        }
        return sum;
    }
    
}
