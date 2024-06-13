package Week2.Exceptions;

import java.io.*;

public class ExceptionsNotes 
{
    // Exception is a subclass of Throwable
    // Has its own subclasses, including RuntimeException, which has
    // its own subclasses    

    // Throwable objects are categorized into two groups:
        // Errors, RuntimeExceptions, and subclasses of RuntimeExceptions (unchecked)
        // Exceptions and subclasses of Exception other than RuntimeException (checked)
    
    // Compiler requires that exceptions are "checked" are handled in a specific way
    // "Unchecked" group are not required to be handled by compiler

    // We will use a code snippet from Chapter 3. 

    /**
     * 
     * @param initialCapacity initial size of array
     * @throws OutOfMemoryError if there is insufficient memory for data
     * @throws IllegalArgumentException if parameter is negative
     */
    public void DoubleArraySeq(int initialCapacity) throws OutOfMemoryError, 
        IllegalArgumentException
    {
        if (initialCapacity < 0) 
        {
            throw new IllegalArgumentException("InitialCapacity is negative: " 
                + initialCapacity);
        }

        // THIS CODE SHOULD NOT BE RUN AND IS JUST AN EXAMPLE FROM THE PROFESSOR NOTES
        
        data = new double[initialCapacity];
        manyItems = 0;
        currentIndex = 0;
    }

    // We can also make up our own exception types if we need to. 
    // This means that we can either extend Exception or RuntimeException depending
    // on the need. You only need a default constructor to pass a message up to the super
    // constructor. 

    // For the ABOVE to work, you have to create your own class. I will write the example
    // as a multi-line comment.

    /*
     * public class DoesNotFollowDirectionsException extends RuntimeException 
     * {
     *      public DoesNotFollowDirectionsException() 
     *      {
     *           super();
     *      }
     * 
     *      public DoesNotFollowDirectionsException(String message) 
     *      {
     *           super(message);
     *      }
     * }
     */
    
    // There are two different ways to properly handle exceptions in Java.
        // 1. Put code in try/catch block
        // 2. Mark methods with throws clause and let thrown exceptions propogate to
        //    the method's caller
    // MUST handle checked exceptions

    /*
     * try 
     * {
     *     // risky code and code depending on previous code
     * }
     * catch (Exception e) 
     * {
     *     // code you want to execute when an exception occurs
     * }
     * finally 
     * {
     *     // code that almost always runs
     *     // if catch executes, finally will run after
     *     // if uncaught exception occurs, finally executes and exception exits method
     *     // if either try or catch execute a return, finally executes before control leaves method
     *     // if either try or catch calls System.exit(), finally will not execute
     *     // finally can happen without catch
     * }
     * 
     * CODE CAN INCLUDE MULTIPLE CATCH BLOCKS FOR MULTIPLE EXCEPTIONS
     */
    
}
