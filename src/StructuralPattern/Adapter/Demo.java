package StructuralPattern.Adapter;

public class Demo {
    public static void main(String[] args) {
        CreditCard creditCard=new BankCustomer();
        creditCard.giveBankDetails();
        System.out.println(creditCard.getCreditCard());

    }

}
