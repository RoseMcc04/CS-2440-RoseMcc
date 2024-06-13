package Week1.EnumsAndArrayLists;

// ArrayList
// arrays are statically-sized
// ArrayLists are dynamically-sized
// - adding may grow the ArrayList
// - removing may shrink the ArrayList

// ArrayList resides in java.util
import java.util.ArrayList;

public class Demo2
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Shay");
        names.add("Colvyn");
        names.add(1, "Nathan");
        print(names);
        names.remove(0);
        System.out.println();
        print(names);
        names.set(1, "Rose");
        System.out.println();
        print(names);
    }
    
    public static void print(ArrayList<String> al)
    {
        for (int i = 0; i < al.size(); i++)
        {
            // array: array[i]
            // ArrayList: get(i)
            System.out.println(al.get(i));
        }
    }
}
