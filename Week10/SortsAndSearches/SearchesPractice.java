package Week10.SortsAndSearches;

/**
 * @author Rose McCormack
 * @version 30 July 2024
 */
public class SearchesPractice
{
    /**
     * @param args This is the main method we will demonstrate linear and 
     * binary searches in.  
     */
    public static void main(String[] args) 
    {
        // Demonstrating linear search
        Integer[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean valuesResult = linearSearch(values, 4);
        System.out.println(valuesResult);
    }

    /**
     * @precondition We should expect to be able to properly search for the
     * specified object in the array structure. 
     * @param arr Array structure search is performed upon
     * @param value Object we want to find in the array structure
     * @return This specific method will return true if we can find the object,
     * and false if we cannot find the object. 
     * @postcondition The value should be in the array. 
     */
    public static <T extends Comparable<? super T>> boolean 
        linearSearch(T[] arr, T value)  
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (value.compareTo(arr[i]) == 0) 
            {
                return true;
            }
        }
        return false;
    }

}
