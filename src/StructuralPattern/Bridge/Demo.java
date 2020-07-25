package StructuralPattern.Bridge;

public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,10,20,new RedCircle());
        Shape GreenCircle = new Circle(100,10,20,new GreenCircle());

        redCircle.draw();
        GreenCircle.draw();
    }
}
