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

        // Demonstrating recursive binary search
        // Slightly more flavored taco night shopping list, check for mangoes
        String[] words = {"tortilla chips", "salsa", "cilantro", "limes", 
            "corn tortillas", "steak", "Jarritos", "mangoes", "green chilis", 
            "bananas", "guava juice", "tamales"};
        int wordsResult = recursiveBinarySearch(words, 0, words.length - 1, 
            "mangoes");
        System.out.println(wordsResult);
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
            // Compares objects to see if they are the same
            if (value.compareTo(arr[i]) == 0) 
            {
                // Object was found
                return true;
            }
        }
        // Object was not found
        return false;
    }

    /**
     * @precondition We should have a proper array along with more specified
     * parameters for our search technique. 
     * @param arr Array structure search is performed upon
     * @param first The first element you want to look for
     * @param size The size of the 
     * @param target The object we want to find in the array the searched is 
     * performed upon
     * @return This method returns the index where the target is found at.
     * @postcondition The value was found in the array using a binary search
     */
    public static <T extends Comparable<? super T>> int 
        recursiveBinarySearch(T[] arr, int first, int size, T target) 
    {
        if (size <= 0) 
        {
            return -1;
        }
        // Looks through list to split list
        int middle = first + (size / 2);
        // Compares middle to potentially avoid worst-case scenario
        int value = target.compareTo(arr[middle]);
        if (value == 0) 
        {
            return middle;
        }
        if (value < 0) 
        {
            // Looks through left half of array structure
            return recursiveBinarySearch(arr, first, size / 2, target);
        }
        // Looks through right half of array structure
        return recursiveBinarySearch(arr, middle + 1, (size - 1) / 2, target);
    }

}
