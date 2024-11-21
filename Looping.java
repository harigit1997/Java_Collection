package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        List <String> Grocery = new ArrayList<>();
        Grocery.add("Sugar");
        Grocery.add("Oil");
        Grocery.add("Tea");
        Grocery.add("Milk");


        //For loop
        System.out.println("Elements in Grocery are:");
        for(int i=0; i<Grocery.size(); i++)
        {
            System.out.println(Grocery.get(i));
        }

        //For-each
        System.out.println("Elements in Grocery are:");
        for(String x: Grocery)
        {
            System.out.println(x);
        }

        // Iterator
        System.out.println("Elements in Grocery are:");
        Iterator <String> it = Grocery.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
