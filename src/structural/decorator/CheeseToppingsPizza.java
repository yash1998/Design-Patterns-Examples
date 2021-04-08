package structural.decorator;

public class CheeseToppingsPizza extends PizzaDecorator {

    public CheeseToppingsPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Added Cheese toppings");
    }
}
