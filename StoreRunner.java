import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    // order 1: 7 Sunset Sticks.
    RockCandy order1 = new RockCandy(3.00, 7, "Sunset");
    System.out.println(order1.toString());

    //order 2: 12 Lava Sticks.
    RockCandy order2 = new RockCandy(3.50, 12, "Lava");
    System.out.println(order2.toString());

    //order 3: 13 Ice Sticks.
    RockCandy order3 = new RockCandy(1.50, 13, "Ice");
    System.out.println(order3.toString());

    //order 4: 100 Pink Sticks.
    RockCandy order4 = new RockCandy(0.50, 100, "Pink");
    System.out.println(order4.toString());
    /*
      uses the Scanner to ask the user for their order.

      Asks for color and amount. 
      Prints the order and the price. 
    */
    System.out.print("\n");
    
    System.out.print("What color do you want? ");
    String newColor = input.nextLine();

    System.out.print("How many do you want? ");
    int newAmount = input.nextInt();

    RockCandy customOrder = new RockCandy(3.00, newAmount, newColor);
    
    System.out.println("/nYour Order: ");
    System.out.println(customOrder.toString());

    // Closes the Scanner object
    input.close();
    
  }
}