package Collections;
import java.util.LinkedList;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList <String> list= new LinkedList<String>();
        list.add("Sugar");
        list.add("Peanuts");
        list.add("Shampoo");
        list.add("Oil");
        list.add("Oil");
        System.out.println(list);
        list.remove("Oil"); // deleting last element from list
        System.out.println(list);
        list.remove("Sugar"); // deleting 1st element from list
        System.out.println(list);

    }
}
