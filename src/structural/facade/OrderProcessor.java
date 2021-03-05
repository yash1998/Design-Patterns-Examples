package structural.facade;

public class OrderProcessor {
    public boolean checkStock(String productName) {
        System.out.println("Checking stock of " + productName);
        return true;
    }

    public int placeOrder(String productName, int quantity) {
        System.out.println("Placing order of " + productName + " with quantity " + quantity);
        return 1; // returning orderId(for example)
    }

    public void shipOrder(int orderId) {
        System.out.println("Shipping order id " + orderId);
    }
}
