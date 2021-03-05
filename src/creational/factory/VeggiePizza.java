package creational.factory;

public class VeggiePizza implements Pizza {
    @Override
    public void makePizza() {
        System.out.println("Making VeggiePizza");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking VeggiePizza");
    }

    @Override
    public void packPizza() {
        System.out.println("Packing VeggiePizza");
    }
}
