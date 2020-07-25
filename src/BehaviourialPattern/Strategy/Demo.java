package BehaviourialPattern.Strategy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1st Number");
        int firstNumber=scan.nextInt();
        System.out.println("2nd Number");
        int SecondNumber=scan.nextInt();
        Context context = new Context(new Add());
        System.out.println(context.executeStrategy(firstNumber,SecondNumber));

        Context context1 = new Context(new Subtract());Subtract subtract=new Subtract();
        System.out.println(context1.executeStrategy(firstNumber,SecondNumber));
    }

}
