package creational.factory;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        // object creation is separated
        Pizza pizza = PizzaFactory.getNewPizza("Veggie");

        pizza.makePizza();
        pizza.bakePizza();
        pizza.packPizza();

        return pizza;
    }
}
