package Week3;

// Found in the java.lang package and sits at top of class heirarchy tree
// Every class is a descendent, direct or indirect, of the Object class
import java.lang.Object;

public class ObjectClassNotes 
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
}
