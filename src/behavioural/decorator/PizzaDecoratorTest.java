package behavioural.decorator;

public class PizzaDecoratorTest {

    public static void main(String[] args) {
        // decorating object of a single class by adding layers.
        Pizza pizza = new CheeseToppingsPizza(new VeggieToppingsPizza(new PlainPizza()));
        pizza.makePizza();
    }
}
