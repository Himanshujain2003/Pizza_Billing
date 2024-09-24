
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("----------Welcome to Pizzamania----------\n");
    System.out.println("Which Pizza: (1.Veg Pizza  2.Non-Veg Pizza  3.Delux Veg Pizza  4.Delux Non-Veg Pizza) ===>");
    Scanner sc = new Scanner(System.in);
    int ch = sc.nextInt();

    switch (ch) {
      case 1:
        Pizza vegPizza = new Pizza(true);  // Corrected class name to Pizza
        vegPizza.addExtraTopping();  // Corrected method name to addExtraTopping
        vegPizza.addExtraCheese();
        vegPizza.takeAway();
        vegPizza.getBill();
        break;
      case 2:
        Pizza nonvegPizza = new Pizza(false);
        nonvegPizza.addExtraTopping();
        nonvegPizza.addExtraCheese();
        nonvegPizza.takeAway();
        nonvegPizza.getBill();
        break;
      case 3:
        DeluxPizza veg = new DeluxPizza(true);
        veg.basePizzaPrice = 500;
        veg.addExtraTopping();
        veg.addExtraCheese();
        veg.takeAway();
        veg.getBill();
        break;
      case 4:
        DeluxPizza nonveg = new DeluxPizza(false);
        nonveg.basePizzaPrice = 650;
        nonveg.addExtraTopping();
        nonveg.addExtraCheese();
        nonveg.takeAway();
        nonveg.getBill();
        break;
      default:
        System.out.println("Sorry, please enter again!");
        
    }
    sc.close();
  }
}
