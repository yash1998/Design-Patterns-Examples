package structural.flyweight;

public class Circle extends Shape {

    @Override
    public void draw(int radius, String fillColor) {
        System.out.println("Drawing a circle with radius " + radius + " and with color " + fillColor);
    }
}
