package Week3;

// Found in the java.lang package and sits at top of class heirarchy tree
// Every class is a descendent, direct or indirect, of the Object class
import java.lang.Object;

public class ObjectClassNotes implements Cloneable
{
    /*
     * Every class used inherits the instance methods of Object. You may
     * not need them regularly, but learning how to override them can make
     * your code powerful.
     */

    /*
     * The following methods are inherited from Object...
     * 
     * public boolean equals(Object obj) --> indicates whether some other object
     * is equal to the input
     * 
     * protected void finalize() throws Throwable --> called by the garbage
     * collector on an object when garbage collection determines there are 
     * no more references to the object 
     * 
     * protected Object clone() throws CloneNotSupportedException --> creates 
     * and returns a copy of the object
     * 
     * public final Class getClass() --> returns the runtime class of an object
     * 
     * public int hashCode() --> returns a hashcode value of an object
     * 
     * public String toString() --> returns a String representation of an object
     */

    // Clone:
    /*
     * clone() will implement the Cloneable interface
     * 
     * Object's use of the clone method creates an object with the same class
     * as the original object; initializes new object's member variables to have
     * the same values as the original object's member variables
     * 
     * for class header, write "implements Cloneable"
     * 
     * We will now write an actual clone method
     */

    /**
     * @param args This is the main method of our notes.
     */
    public static void main(String[] args)
    {
        Dog dog = new Dog("ruhruhruhruh", false);
        dog1 = dog.clone();
    }
    
    /**
     * @return Returns a clone of the dog object
     */
    public Dog clone() 
    {
        Dog dog1;
        try 
        {
            dog1 = (Dog) super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            throw new RuntimeException("No Cloneable Implemented");
        }
        finally 
        {
            System.out.println("This example is over!");
        }
        return dog1;
    }
}
