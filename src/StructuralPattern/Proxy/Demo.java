package StructuralPattern.Proxy;

public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("20mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
