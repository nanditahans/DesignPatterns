package BehaviourialPattern.ChainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        Chain chain=new Chain();
        chain.process(new Number(10));
        chain.process(new Number(-10));
        chain.process(new Number(0));
    }

}
