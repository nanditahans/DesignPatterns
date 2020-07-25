package BehaviourialPattern.Strategy;

public class Add implements Strategy {
    @Override
    public int calculation(int a, int b) {
        return a+b;
    }
}
