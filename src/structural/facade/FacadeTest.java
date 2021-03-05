package structural.facade;

public class FacadeTest {
    public static void main(String[] args) {
        OrderFacade facade = new OrderFacade();
        facade.processOrder("Mobile", 2);
    }
}
