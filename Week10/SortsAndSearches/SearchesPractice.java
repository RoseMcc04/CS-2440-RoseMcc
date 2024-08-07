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
     * 
     * Complexity: O(n) due to iteration through every element possible. 
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
     * @param first The first element in the section you want to search
     * @param size The size of the section you want to search
     * @param target The object we want to find in the array the searched is 
     * performed upon
     * @return This method returns the index where the target is found at.
     * @postcondition The value was found in the array using a binary search
     * 
     * Complexity: O(log(n)) due to reduction of search space by one-half at 
     * each step. 
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

    /**
     * @precondition The array and target are both valid in Java. 
     * @param arr Array the user wants to search
     * @param target Object being searched for
     * @return This method returns the index where the target is at in the 
     * array.
     * @postcondition The value was found in the array using a binary search.
     * 
     * Complexity: O(log(n)) due to reduction of search space after each step.
     */
    public static <T extends Comparable<? super T>> int 
        regularBinarySearch(T[] arr, T target) 
    {
        int low = 0;
        int high = arr.length - 1;
        int middle;
        int value;
        // Search between low and high, inclusive
        while(low <= high) 
        {
            middle = (low + high) / 2;
            value = target.compareTo(arr[middle]);
            if (value == 0) 
            {
                // Target is the middle element
                return middle;
            }
            else if (value < 0) 
            {
                // Target before middle element
                high = middle - 1;
            }
            else 
            {
                // Target after middle element
                low = middle + 1;
            }
        }
        // Target is not in the array
        return -1;
    }
}
