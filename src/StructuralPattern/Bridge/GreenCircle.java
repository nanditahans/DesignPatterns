package StructuralPattern.Bridge;

public class GreenCircle implements Draw {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("It is a GreenCircle with Radius: "+radius+" x coordinate :"+x+" Y coordinate : "+y);
    }
}
