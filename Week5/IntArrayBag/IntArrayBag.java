package Week5.IntArrayBag;

// holds bag elements
private int[] data;
// number of elements
private int manyItems;

public class IntArrayBag implements Cloneable
{
    // In Chapter 3, we are introduced to the Collections framework in Java. We
    // learn how to specify, design, and implement method for these structures. 
    // Collections is known as a container class, the interface between a few
    // methods and the underlying data structures. 

    // We will create an IntArrayBag class to demonstrate the fundamental ideas
    // of the methods often found in Collections classes. 

    /**
     * This is the no-arg constructor used to initialize an IntArrayBag object 
     * for later classes. 
     */
    public IntArrayBag() 
    {
        // Make an array of size 10 and set manyItems to 0
        final int INITIAL_CAPACITY = 10;
        manyItems = 0;
        data = new int[INITIAL_CAPACITY];
    }

    /**
     * @param initialCapacity This is the one-arg constructor used to 
     * initialize an IntArrayBag object with a given capacity for later 
     * classes.
     */
    public IntArrayBag(int initialCapacity) 
    {
        // Make array of size initialCapacity and set manyItems to 0
        if (initialCapacity < 0) 
        {
            throw new IllegalArgumentException("initialCapacity is " 
                + "negative: " + initialCapacity);
        }
        manyItems = 0;
        data = new int[initialCapacity];
    }

    /**
     * @param element The integer added to the IntArrayBag structure
     */
    public void add(int element) 
    {
        if (manyitems == data.length) 
        {
            // Double capacity and add 1
            // Even if manyItems * 2 + 1 > integer.MAX_VALUE, there will be an
            // arithmetic overflow and the bag will fail
            ensureCapacity(manyItems * 2 + 1);
        }
    }

    /**
     * @param addend The IntArrayBag being added to another IntArrayBag
     */
    public void addAll(IntArrayBag addend) 
    {
        // if addend is null, then a NullPointerException is thrown
        // In the case total number of items > integer.MAX_VALUE, there will be
        // an arithmetic overflow and the bag will fail
        ensureCapacity(manyItems + addend.manyItems);

        // Use System.arraycopy() to copy elements from addend.data to data
        // Start at manyItems and increment manyItems each time
        System.arraycopy(addend.data, 0, data, manyItems, addend.manyItems);
        manyitems += addend.manyItems;
    }

    /**
     * @param elements Any number of elements inputted added to the IntArrayBag
     */
    public void addMany(int... elements) // Notation allows for multiple inputs
    {
        if (manyitems + elements.length > data.length) 
        {
            // Ensure twice as much space as we need
            ensureCapacity((manyItems + elements.length)*2);
        }

        // Use System.arraycopy() to copy elements to data and increment 
        // manyitems
        System.arraycopy(elements, 0, data, manyItems, elements.length);
        manyItems += elements.length;
    }

    /**
     * @return Returns a clone of the IntArrayBag object
     */
    public IntArrayBag clone() 
    {
        IntArrayBag answer;
        try 
        {
            answer = (IntArrayBag) super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            // Exception should not occur, but if it does, it would indicate a
            // programming error not allowing super.clone() to be unavailable.
            // Start the class with "implements Cloneable"
            throw new RuntimeException("This class does not implemenet " 
                + "Cloneable.");
        }
        answer.data = data.clone();
        return answer;
    }

    /**
     * @param target Element we want to count instances of
     * @return Returns the count of the inputted element
     */
    public int countOccurrences(int target) 
    {
        int index;
        int answer = 0;
        for (index = 0; index < manyItems; index++) 
        {
            if (target == data[index]) 
            {
                answer++;
            }
        }
        return answer;
    }

    /**
     * @param minimumCapacity The minimum capacity of the IntArrayBag object
     * created
     */
    public void ensureCapacity(int minimumCapacity) 
    {
        int[] biggerArray;
        if (data.length < minimumCapacity) 
        {
            biggerArray = new int[minimumCapacity];
            System.arraycopy(data, 0, biggerArray, 0, manyItems);
            data = biggerArray;
        }
    }

    /**
     * @return Returns the capacity of the IntArrayBag object
     */
    public int getCapacity() 
    {
        return data.length;
    }

    /**
     * @param target Element inputted we want to remove
     * @return Returns if we deleted the element or not
     */
    public boolean remove(int target) 
    {
        int index; // Location of target in data array

        // First, set index to location of target
        // If target is not in the array, index = manyitems
        index = 0;
        while ((index < manyItems) && (target != data[index])) 
        {
            index++;
        }
        if (index == manyItems) 
        {
            // target was not found, so nothing is removed
            return false;
        }
        else 
        {
            // target found at data[index]
            manyItems--;
            data[index] = data[manyItems];
            return true;
        }
    }

    /**
     * @return Returns manyItems
     */
    public int size() 
    {
        return manyItems;
    }

    /**
     * This method creates a new array if data.length > manyItems
     */
    public void trimToSize() 
    {
        int[] trimmedArray;
        if (data.length != manyItems) 
        {
            trimmedArray = new int[manyItems];
            System.arraycopy(data, 0, trimmedArray, 0, manyItems);
            data = trimmedArray;
        }
    }

    /**
     * @param b1 First IntArrayBag inputted
     * @param b2 Second IntArrayBag inputted
     * @returns Returns a new IntArrayBag object that combines the two inputs
     */
    public static IntArrayBag union(IntArrayBag b1, IntArrayBag b2) 
    {
        // If either b1 or b2 is null, then a NullPointerException is thrown
        // In case total number > integer.MAX_VALUE, there will be an 
        // arithmetic overflow and the bag will fail
        IntArrayBag answer = new 
            IntArrayBag(b1.getCapacity() + b2,getCapacity()); 

        System.arraycopy(b1.data, 0, answer.data, 0, b1.manyItems);
        System.arrayCopy(b2.data, 0, answer.data, b1.manyItems, b2.manyItems);
        answer.manyItems = b1.manyItems + b2.manyItems;
        return answer;
    }
}
