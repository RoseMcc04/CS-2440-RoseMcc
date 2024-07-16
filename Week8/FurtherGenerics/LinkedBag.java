package Week8.FurtherGenerics;

public class LinkedBag<E> implements Cloneable
{
    private int manyNodes;
    private Node<E> head;


    /**
     * This is the no-arg constructor for the generic linked bag.
     */
    public LinkedBag() 
    {
        head = null;
        manyNodes = 0;
    }

    /**
     * @param element This method adds a new element to the linked bag object.
     */
    public void add(E element) 
    {
        head = new Node<E>(element, head);
        manyNodes++;
    }

    /**
     * @param addend This method adds another linked bag object to our 
     * current linked bag.
     */
    public void addAll(LinkedBag<E> addend) 
    {
        Node<E>[] copyInfo;
        if (addend.manyNodes > 0) 
        {
            copyInfo = Node.listCopyWithTail(addend.head);
            copyInfo[1].setLink(head);
            head = copyInfo[0];
            manyNodes += addend.manyNodes;
        }
    }

    /**
     * @param elements This method allows us to add multiple elements to the
     * linked bag object.
     */
    public void addMany(Node<E>... elements) 
    {
        for (E i : elements) 
        {
            add(i);
        }
    }
}
