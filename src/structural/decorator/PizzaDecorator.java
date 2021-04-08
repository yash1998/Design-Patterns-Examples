package structural.decorator;

public class PizzaDecorator implements Pizza {

    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void makePizza() {
        pizza.makePizza();
    }
}
