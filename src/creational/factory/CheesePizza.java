package creational.factory;

public class CheesePizza implements Pizza {
    @Override
    public void makePizza() {
        System.out.println("Making CheesePizza");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking CheesePizza");
    }

    @Override
    public void packPizza() {
        System.out.println("Packing CheesePizza");
    }
}
