package StructuralPattern.Bridge;

public class Circle extends Shape {
    int x, y,radius;


    protected Circle(int x, int y, int radius, Draw draw) {
        super(draw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        draw.drawCircle(radius,x,y);

    }
}
