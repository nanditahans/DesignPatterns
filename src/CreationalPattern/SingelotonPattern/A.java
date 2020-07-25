package CreationalPattern.SingelotonPattern;

public class A {
    private static A a=new A();

    public A() {
    }
    public static A getInstance(){
        return a;
    }
    public void message(){
        System.out.println("I am A");
    }
}
