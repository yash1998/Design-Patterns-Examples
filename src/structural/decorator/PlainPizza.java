package structural.decorator;

public class PlainPizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("Made Plain pizza");
    }
}
