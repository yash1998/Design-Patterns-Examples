package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> cacheForShapes = new HashMap<>();

    public static Shape createShape(String shapeName) {
        Shape shape = null;
        if (cacheForShapes.get(shapeName) != null) {
            shape = cacheForShapes.get(shapeName);
        } else {
            if (shapeName.equalsIgnoreCase("circle")) {
                shape = new Circle();
            } else if (shapeName.equalsIgnoreCase("rectangle")) {
                shape = new Rectangle();
            }
            cacheForShapes.put(shapeName, shape);
        }
        return shape;
    }

}
