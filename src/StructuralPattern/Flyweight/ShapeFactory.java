package StructuralPattern.Flyweight;

import javax.jws.Oneway;
import java.util.HashMap;

public class ShapeFactory {

    public static final HashMap circleMap=new HashMap();
    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("\nnCreating circle of color : " + color);
        }
        return circle;
    }
}
