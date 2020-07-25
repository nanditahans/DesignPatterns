package BehaviourialPattern.Strategy;

public class Subtract implements Strategy{
    @Override
    public int calculation(int a, int b) {
        return a-b;
    }
}
