package structural.flyweight;

public class PaintApp {
    public void paint(int noOfShapes) {
        Shape shape;
        for (int i = 1; i <= noOfShapes; i++) {
            if (i % 2 == 0) {
                shape = ShapeFactory.createShape("circle");
                shape.draw(i, "red");
            } else {
                shape = ShapeFactory.createShape("rectangle");
                shape.draw(i, i * 2, "red");
            }
        }
    }
}
