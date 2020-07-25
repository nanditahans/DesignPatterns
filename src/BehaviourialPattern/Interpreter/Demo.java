package BehaviourialPattern.Interpreter;

public class Demo {

    public static void main(String[] args) {
        Expression expression1=new TerminalExpression("hii");
        Expression expression2=new TerminalExpression("hello");
        Expression or=new OrExpression(expression1,expression2);

        Expression expression3=new TerminalExpression("hiiii");
        Expression expression4=new TerminalExpression("helloooo");
        Expression and=new AndExpressions(expression3,expression4);

        System.out.println(or.interpreter("hii"));
        System.out.println(or.interpreter("hello"));
        System.out.println(or.interpreter("bye"));

        System.out.println(and.interpreter("hiiii,helloooo"));
        System.out.println(and.interpreter("bye,helloooo"));

    }



}
