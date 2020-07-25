package CreationalPattern.FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String args[]) throws IOException {
        GetPlan getPlan=new GetPlan();
        System.out.println("Enter plan Name");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String planName=br.readLine();
        System.out.println("Enter units");
        int units=Integer.parseInt(br.readLine());
        Plan p=getPlan.getPlan(planName);
        p.getRate();
        p.calculateBill(units);


    }
}
