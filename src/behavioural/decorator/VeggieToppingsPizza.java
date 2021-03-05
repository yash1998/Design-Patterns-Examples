package behavioural.decorator;

public class VeggieToppingsPizza extends PizzaDecorator {

    public VeggieToppingsPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Added Veggie toppings");
    }
}
