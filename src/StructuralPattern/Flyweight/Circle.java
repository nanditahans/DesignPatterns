package StructuralPattern.Flyweight;

public class Circle implements Shape{

    private String color;
    private int x;
    private int y;


    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}');
    }
}
