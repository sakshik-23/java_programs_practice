import java.util.Scanner;

public class ShoppingCartProgram{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='$';
        double total_price;

        System.out.println("What item would you like to buy?:");
        item=sc.nextLine();

        System.out.println("What is the price for each?:");
        price=sc.nextDouble();

        System.out.println("How much items do you want?:");
        quantity=sc.nextInt();


        total_price=price*quantity;

        System.out.println("You have bought "+ quantity + " " + item +"/s");
        System.out.println("Your total is: "+ currency + total_price);
        sc.close();
    }
}