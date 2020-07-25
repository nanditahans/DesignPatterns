package CreationalPattern.AbstractFactoryPattern;

public class DEmo {
    public static void main(String[] args) {
        AbstractFactory abstractFactory= Factory.getShapeType(false);
        Shape shape1=abstractFactory.getShape("RECTANGLE");
        shape1.draw();
        AbstractFactory abstractFactory1 = Factory.getShapeType(true);
        Shape shape2=abstractFactory1.getShape("ROUNDEDRECTANGLE");
        shape2.draw();

    }

}
