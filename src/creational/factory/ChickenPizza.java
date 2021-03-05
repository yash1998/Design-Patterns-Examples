package creational.factory;

public class ChickenPizza implements Pizza {
    @Override
    public void makePizza() {
        System.out.println("Making ChickenPizza");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking ChickenPizza");
    }

    @Override
    public void packPizza() {
        System.out.println("Packing ChickenPizza");
    }
}
