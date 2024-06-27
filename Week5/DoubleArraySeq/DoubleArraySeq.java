package Week5.DoubleArraySeq;

// Implement Cloneable for DoubleArraySeq.clone()

public class DoubleArraySeq implements Cloneable
{
    /*
    During notes for IntArrayBag, there is no significance in ordering of
    the elements in the underlying array structure, which means you cannot
    iterate through the elements of the bag properly. However, with a 
    sequence, the order of elements is at the user's control and methods
    are provided to iterate from the beginning to the end of the sequence.
    
    The DoubleArraySeq class is a container class designed to hold doubles
    in a partially filled array. First, we need to discuss partially filled
    arrays. Also, we need to create our methods for this container class.
    */

    /**
     * Create a sequence large enough for 10 elements
     */
    public DoubleArraySeq() 
    {

    }

    /**
     * @param initialCapacity The size of the sequence we are creating
     */
    public DoubleArraySeq(int initialCapacity) 
    {

    }

    /**
     * @param element Number we want to add to the DoubleArraySeq object
     */
    public void addAfter(double element) 
    {
        /*
        Add a new element right after the current element (if there is a 
        current element). Otherwise, put the new element at the end.
        */
    }

    /**
     * @param element Number we want to add to the DoubleArraySeq object
     */
    public void addBefore(double element) 
    {
        /* 
        Add a new element right before the current element (if there is a 
        current element). Otherwise, put the new one at the beginning.
        */ 
    }

    /**
     * @param addend DoubleArraySeq object that will be concatenated with the
     * original object
     */
    public void addAll(DoubleArraySeq addend) 
    {
        /* 
        Add all the elements of addend onto the end of the activating 
        sequence. Do not change the current element.
        */
    }

    /**
     * Method that advances to the next index in the DoubleArraySeq object
     */
    public void advance() 
    {
        /*
        Make the next element after the current one become the current element.
        If the current element is the last element, there will no longer be a 
        current element.
        */
    }

    /**
     * @return Returns a deep clone of the DoubleArraySeq object 
     */
    public DoubleArraySeq clone() 
    {
        // Do a deep clone
    }

    /**
     * @param s1 First DoubleArraySeq inputted by the user
     * @param s2 Second DoubleArraySeq inputted by the user
     * @return Returns a DoubleArraySeq that concatenates the two inputs
     */
    public static DoubleArraySeq concatenation(DoubleArraySeq s1, 
        DoubleArraySeq s2) 
    {
        /*
         Return a new sequence consisting of the elements of s1 and s2. The new
         sequence will not have a current element.
         */
    }
    
    /**
     * @param minimumCapacity Integer value of the minimum capacity of the 
     * DoubleArraySeq object
     */
    public void ensureCapacity(int minimumCapacity) 
    {
        /*
         If minimumCapacity is larger than data.length, make an array of size
         minimumCapacity. Then copy all of the elements. Make the data point to
         the new array.
         */
    }

    /**
     * @return Returns the size of the DoubleArraySeq
     */
    public int getCapacity() 
    {

    }

    /**
     * @return Returns the current element
     */
    public double currentElement() 
    {

    }

    /**
     * @return Returns if there is a current element (true) or not (false)
     */
    public boolean isCurrent() 
    {
        
    }
}
