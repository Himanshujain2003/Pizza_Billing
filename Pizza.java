
import java.util.Scanner;

public class Pizza {
  protected int price;
  private Boolean veg;

  protected int extraCheesePrice = 100;
  protected int extraToppingsPrice = 150;  // Corrected the typo from extraToppingsprice to extraToppingsPrice
  protected int backPackPrice = 20;

  protected int basePizzaPrice;
  protected boolean isExtraCheeseAdded = false;
  protected boolean isExtraToppingsAdded = false;
  private boolean isOptedForTakeaway = false;

  Scanner in = new Scanner(System.in);

  public Pizza(Boolean veg) {
    this.veg = veg;
    if (this.veg) {
      this.price = 300;
    } else {
      this.price = 400;
    }
    basePizzaPrice = this.price;
  }

  public void addExtraCheese() {
    System.out.println("Extra cheese (y/n)? =>");
    char ch = in.next().charAt(0);
    if (ch == 'y') {
      isExtraCheeseAdded = true;
      this.price += extraCheesePrice;
    }
  }

  public void addExtraTopping() {  // Corrected method name to addExtraTopping
    System.out.println("Want Topping (y/n)? =>");
    char ch = in.next().charAt(0);
    if (ch == 'y') {
      isExtraToppingsAdded = true;
      this.price += extraToppingsPrice;
    }
  }

  public void takeAway() {
    System.out.println("Want TakeAway (y/n)? =>");
    char ch = Character.toLowerCase(in.next().charAt(0));
    if (ch == 'y') {
      isOptedForTakeaway = true;
      this.price += backPackPrice;
    }
  }

  public void getBill() {
    String bill = "";
    System.out.println("Pizza: " + basePizzaPrice);
    if (isExtraCheeseAdded) {
      bill += "Extra Cheese: " + extraCheesePrice + "\n";
    }
    if (isExtraToppingsAdded) {
      bill += "Extra Toppings: " + extraToppingsPrice + "\n";
    }
    if (isOptedForTakeaway) {
      bill += "Takeaway: " + backPackPrice + "\n";
    }
    bill += "\nTotal Amount: " + this.price + "\n";
    System.out.println(bill);
    System.out.println("\n\n\nThank you! Visit Again...");
    System.out.println("--------------------------");
  }
}
