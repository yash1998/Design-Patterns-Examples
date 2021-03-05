package creational.factory;

public class PizzaFactory {
    public static Pizza getNewPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("Chicken")) {
            pizza = new ChickenPizza();
        }
        return pizza;
    }
}