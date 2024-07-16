package Week8.FurtherGenerics;

public class LinkedBag<T> implements Cloneable
{
    private int manyNodes;
    private Node<T> head;


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
    public void add(T element) 
    {
        head = new Node<T>(element, head);
        manyNodes++;
    }

    /**
     * @param addend This method adds another linked bag object to our 
     * current linked bag.
     */
    public void addAll(LinkedBag<T> addend) 
    {
        Node<T>[] copyInfo;
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
    @SuppressWarnings("unchecked")
    public void addMany(T... elements) 
    {
        for (T i : elements) 
        {
            add(i);
        }
    }

    /**
     * This method will allow us to create a deep copy of our linked bag
     * object.
     */
    @SuppressWarnings("unchecked")
    public Object clone() 
    {
        LinkedBag<T> answer;
        try 
        {
            answer = (LinkedBag<T>) super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            throw new RuntimeException("CloneNotSupportedException found!");
        }
        answer.head = Node.listCopy(head);
        return answer;
    }

    /**
     * @param target The element where occurrances are being counted with. 
     * @return This method returns the number of instances of the object being
     * counted.
     */
    public int countOccurrances(T target) 
    {
        int answer = 0;
        Node<T> cursor = Node.listSearch(head, target);
        while (cursor != null) 
        {
            answer++;
            cursor = cursor.getLink();
            cursor = Node.listSearch(head, target);
        }
        return answer;
    }

    /**
     * @return This method returns a random element from the linked bag object.
     */
    public T grab() 
    {
        int i;
        Node<T> cursor;
        if (manyNodes == 0) 
        {
            throw new IllegalStateException("Bag size is zero.");
        }
        i = (int) (Math.random() * manyNodes) + 1;
        cursor = Node.listPosition(head, i);
        return cursor.getData();
    }

    /**
     * @param target The element we would like to remove. 
     * @return This method returns if the target to be removed was found or 
     * not. 
     */
    public boolean remove(T target) 
    {
        Node<T> targetNode = Node.listSearch(head, target);
        if (targetNode == null) 
        {
            return false;
        }
        else 
        {
            targetNode.setData(head.getData());
            head = head.getLink();
            manyNodes--;
            return true;
        }
    }

    /**
     * @return This method returns the number of elements in the bag. 
     */
    public int size() 
    {
        return manyNodes;
    }
}
