package BehaviourialPattern.Strategy;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(int num1, int num2){
        return strategy.calculation(num1, num2);
    }
}
