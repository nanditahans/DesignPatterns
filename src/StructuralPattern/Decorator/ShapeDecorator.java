package StructuralPattern.Decorator;

public abstract class ShapeDecorator implements Shape{

    protected Shape shapedecorator;

    public ShapeDecorator(Shape shapedecorator) {
        this.shapedecorator = shapedecorator;
    }

    public void draw() {
        shapedecorator.draw();
    }
}
