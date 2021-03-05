package structural.flyweight;

public class Rectangle extends Shape {

    @Override
    public void draw(int length, int breadth, String fillColor) {
        System.out.println("Drawing a rectangle with length " + length + " and breadth " +
                breadth + " and with color " + fillColor);
    }
}
