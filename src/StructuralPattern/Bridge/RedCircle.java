package StructuralPattern.Bridge;

public class RedCircle implements Draw{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("It is a RedCircle with Radius: "+radius+" x coordinate :"+x+" Y coordinate : "+y);
    }
}
