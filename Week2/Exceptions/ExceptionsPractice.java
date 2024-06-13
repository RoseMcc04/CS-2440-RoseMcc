package Week2.Exceptions;

public class ExceptionsPractice extends Exception
{
    // We will be looking at different techniques of exception
    // handling in Java. 

    /*
     * 1. Write a statement that throws an IndexOutOfBoundsException
     *    if the int 'index' has a value that is not in the range [0. 
     *    numArray.length - 1]. Make the message of the exception be 
     *    "invalid index: " followed by the value of 'index'.
     */

    // 1D Array that is in class scope
    int[] array = new int[5];
    private String message;
    /**
     * 
     * @param index This method determines if the index is part of the 
     * array or not. 
     */
    public void outOfBounds(int index) 
    {
        if (index < 0 || index >= array.length) 
        {
            throw new IndexOutOfBoundsException("Invalid Index: " 
                + index);
        }
    }

    public ExceptionsPractice() 
    {
        // Calling primary Exception constructor
        super("exceptions practice");
    }

    public ExceptionsPractice(String msg) 
    {
        super(msg);
    }

}
