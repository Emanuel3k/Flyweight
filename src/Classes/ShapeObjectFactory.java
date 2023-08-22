package Classes;
import java.util.HashMap;
import java.util.Map;

import Interface.IShape;

public class ShapeObjectFactory {
    Map<String, IShape> shapes = new HashMap<>();

    public int getTotalObjectsCreated() {
        return shapes.size();
    }

    public IShape GetShape(String shapeName) throws Exception {

        IShape shape = null;
        if (shapes.containsKey(shapeName)) {
            shape = shapes.get(shapeName);
        } else {
            switch (shapeName) {
                case "Rectangle":
                    shape = new Rectangle();
                    shapes.put("Rectangle", shape);
                    break;
                case "Circle":
                    shape = new Circle();
                    shapes.put("Circle", shape);
                    break;
                default:
                    throw new Exception("Factory cannot create the object specified");
            }
        }
        return shape;

    }
}