package Week1.EnumsAndArrayLists;

import Week1.EnumsAndArrayLists.Test.Status;

public class Demo
{
    private Day weekday;
    
    public Demo(Day d)
    {
        weekday = d;
        System.out.println(weekday);
    }
    
    public static void main(String[] args)
    {
        //Demo d = new Demo(Day.WED);
        // values method
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++)
        {
            Day d = days[i];
            System.out.print(d + " " + (d.ordinal() + 1) + " ");
        }
        System.out.println();
        
        // compareTo: returns negative if calling < passed
        //                    zero if calling == passed
        //                    positive if calling > passed
        Day day1 = Day.FRI;
        Day day2 = Day.MON;
        int diff = day1.compareTo(day2);
        if (diff > 0)
        {
            System.out.println("calling is greater");
        }
        else if (diff < 0)
        {
            System.out.println("calling is smaller");
        }
        else
        {
            System.out.println("equivalent");
        }
        
        switch (day1)
        {
            case MON:
                System.out.println(":(");
                break;
            case FRI:
                System.out.println(":)");
        }
        
        //System.out.println(Status.PASSED); // compilation error!!
        System.out.println(Test.Status.PASSED);
    }
}
