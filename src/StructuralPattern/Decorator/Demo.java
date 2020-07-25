package StructuralPattern.Decorator;

public class Demo {
    public static void main(String[] args) {
        Shape circle=new Circle();
        Shape redcircle=new RedShapeDecorator(new Circle());
        Shape rectangle=new RedShapeDecorator(new Rectangle());
        circle.draw();
        redcircle.draw();
        rectangle.draw();
    }
}
