package Week8.WildcardsAndIterators;

public class IteratorNotes 
{
    // Iterable
    
    /*
     * Iterable is another generic interface in the Java library. It sounds 
     * similar to Iterator, but does a different job. For a class to implement
     * iterable, it must implement... public Iterator<T> iterator()
     * 
     * The method stated above returns an Iterator. This interface allows a 
     * programmer to use a for/each loop to iterate over each collection.
     * 
     * Container classes implement the Iterable<E> interface and return an
     * iterator that is built for the class. That means that typically, you
     * will build a class that implements Iterator<E> to iterate over your 
     * container class, then return a new object of that iterator in the 
     * Iterable method. 
     */
}
