package CreationalPattern.SingelotonPattern;

public class Demo {
    public static void main(String[] args) {
        A a= A.getInstance();
        a.message();
    }

}
