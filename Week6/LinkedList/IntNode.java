package Week6.LinkedList;

public class IntNode 
{
    // Element stored in the current node
    private int data;
    // Refers to the next node in the list
    private IntNode link;

    // Declaring head and tail nodes
    IntNode head;
    IntNode tail;

    /**
     * @param initialData Initial data of the new node
     * @param initialLink Reference to the node after the current node in the
     * list
     */
    public IntNode(int data, IntNode link) 
    {
        this.data = data;
        this.link = link;
    }

    /**
     * @return Returns the data of the current node
     */
    public int getData() 
    {
        return this.data;
    }

    /**
     * @return Returns the refernece to the node after the current node in the
     * list
     */
    public IntNode getLink() 
    {
        return this.link;
    }

    /**
     * @param data Data set for the current node
     */
    public void setData(int data) 
    {
        this.data = data;
    }

    /**
     * @param link Link to next node set for current node
     */
    public void setLink(IntNode link) 
    {
        this.link = link;
    }

    // Modification method to be placed in the new node
    /**
     * @param element Data placed in the new node
     */
    public void addNodeAfter(int element) 
    {
        try 
        {
            this.link = new IntNode(element, link);
        }
        catch (OutOfMemoryError e) 
        {
            System.out.println("Out of memory!");
        }
    }

    /**
     * Method that removes the node after the current node
     */
    public void removeNodeAfter() 
    {
        // Cannot be the tail node of the list
        // Means "go to the node that link refers to and use the link instance
        // variable you find there"
        try 
        {
            this.link = link.link;
        }
        catch (NullPointerException e) 
        {
            System.out.println("Current node is the tail, set node to" 
                + " different node!");
        }
    }
}
