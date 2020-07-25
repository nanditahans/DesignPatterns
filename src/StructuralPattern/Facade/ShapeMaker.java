package StructuralPattern.Facade;

public class ShapeMaker {

    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker() {
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }


    void drawRectangle(){
        rectangle.draw();
    }
    void drawCircle(){
        circle.draw();
    }
    void drawSquare(){
        square.draw();
    }
}
