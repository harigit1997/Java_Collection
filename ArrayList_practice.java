package Collections;
import java.util.ArrayList;
public class ArrayList_practice {
    public static void main(String[] args) {
        ArrayList <String> Items = new ArrayList<>();
        Items.add("Oil");
        Items.add("Nuts");
        Items.add("Detergent");
        Items.add("Sugar");
        Items.add("Tomato");
        Items.add("Potato");
        Items.add("Potato");
        System.out.println(Items);
        Items.remove("Oil");
        System.out.println(Items);
        Items.remove("Potato");
        System.out.println(Items);
        Items.remove("Potato"); // trying to remove already removed element
        System.out.println(Items);
        Items.remove("Sugar");
        System.out.println(Items);
        System.out.println(Items.isEmpty()); // check for empty
        System.out.println(Items.contains("Tomato")); // contains specific item
    }
}
