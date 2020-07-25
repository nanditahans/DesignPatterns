package StructuralPattern.Decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shapedecorator) {
        super(shapedecorator);
    }

    public void draw() {
        shapedecorator.draw();
        setRedBorder(shapedecorator);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("I have a red border");
    }
}
