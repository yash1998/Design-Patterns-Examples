package creational.factory;

public class PizzaStoreTest {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();
        Pizza pizza = store.orderPizza("Veggie");
    }
}
