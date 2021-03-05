package structural.facade;

public class OrderFacade {
    public void processOrder(String productName, int quantity) {
        OrderProcessor processor = new OrderProcessor();
        if (processor.checkStock(productName)) {
            int orderId = processor.placeOrder(productName, quantity);
            processor.shipOrder(orderId);
        }
    }
}
