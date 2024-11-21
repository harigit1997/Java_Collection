package Super_Market;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
// Purchasing
public class Stock_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Float> Stock = new HashMap<String, Float>();
        System.out.println("Welcome! to\n------------SUPER SHOPEE-----------\n");
        int choice;
        do {
            System.out.println("Select the choice\n 1.Add Product \n 2.Update Product\n 3.View Cart \n 4.Delete Product \n 5.Bill Generation\n 6.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Product ? Price?");
                    Stock.put(sc.next(), sc.nextFloat());
                    break;
                case 2:
                    System.out.println(" Which Product do you want to change? Quantity?");
                    Stock.put(sc.next(), sc.nextFloat());
                    break;
                case 4:
                    System.out.println("What you want to remove?");
                    Stock.remove(sc.next());
                    break;
                case 3:
                    System.out.println("Pls check Product with Quantity!");
                    System.out.println(Stock);
                    break;
                case 5:
                    System.out.println("Total Bill: ");
//                    static int bill(Object Stock)
//                        {
//                            for(int i=0; i< Stock.size(); i++)
//                            {
//                                bill=Stock.get(i);
//                            }
//                        }
                    System.out.println(Stock.get(sc.next()+"Anything else!"));
                    break;
                case 6:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Please enter valid Option!");
            }
        }
        while(choice != 6);
    }
}
