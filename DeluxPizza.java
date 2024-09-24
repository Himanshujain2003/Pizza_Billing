

public class DeluxPizza extends Pizza {
  public DeluxPizza(Boolean veg) {
    super(veg);
    // Delux pizzas include extra cheese and toppings by default
    addExtraCheese(); 
    addExtraTopping();
  }

  @Override
  public void addExtraCheese() {
    if (!isExtraCheeseAdded)
     {  // Ensuring the cheese isn't added twice
      this.price += extraCheesePrice;
      boolean isExtraCheeseAdded = true;
    }
  }

  @Override
  public void addExtraTopping() {
    if (!isExtraToppingsAdded)
     {  // Ensuring the toppings aren't added twice
      this.price += extraToppingsPrice;
      isExtraToppingsAdded = true;
    }
  }
}
