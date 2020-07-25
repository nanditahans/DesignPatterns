package BehaviourialPattern.Interpreter;

public class AndExpressions implements Expression{
    Expression expr1;
    Expression expr2;

    public AndExpressions(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String con) {
        return  expr1.interpreter(con)&&expr2.interpreter(con);
    }
}
