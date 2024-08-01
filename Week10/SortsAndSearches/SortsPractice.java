package Week10.SortsAndSearches;

/**
 * @author Rose Adrianna 
 * @version 1 August 2024
 */
public class SortsPractice 
{
    /**
     * @param <T> Used for generic implementation of the swapping in 
     * selection sort
     * @param i First index to be swapped (often lesser than)
     * @param j Second index to be swapped (often greater than)
     */
    private <T> void swap(T[] arr, int i, int j) 
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * @param arr This is the generic array being sorted in the method.
     * 
     * This method performs a basic selection sort on a generic array. We 
     * cannot use this for primitive types. 
     * 
     * Complexity: O(n^2)
     * 
     * Reasoning: We have to perform n iterations to find the smallest element
     * for all n elements. 
     */
    public <T extends Comparable<? super T>> void selectionSort(T[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j].compareTo(arr[minIndex]) < 0) 
                {
                    minIndex = j;
                }
            }
            if (minIndex != i) 
            {
                swap(arr, i, minIndex);
            }
        }
    }

    /**
     * @param arr This is the generic array being sorted in the method. 
     * 
     * This method performs a basic insertion sort on a generic array. We 
     * cannot use this for primitive types. 
     * 
     * Complexity: O(n^2)
     * 
     * Reasoning: We have to perform n swaps for n elements. 
     */
    public <T extends Comparable<? super T>> void insertionSort(T[] arr) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            T current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(current) > 0) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = current;
        }
    }

    /**
     * @param arr This is the generic array being sorted in the method. 
     * 
     * This method performs a basic bubble sort on a generic array. We 
     * cannot use this for primitive types. 
     * 
     * Complexity: O(n^2)
     * 
     * Reasining: We have n swaps per iteration and it iterates n times. 
     */
    public <T extends Comparable<? super T>> void bubbleSort(T[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j].compareTo(arr[j + 1]) > 0) 
                {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) 
            {
                break;
            }
        }
    }
}
