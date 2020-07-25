package StructuralPattern.Adapter;

import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard{
    Scanner scan = new Scanner(System.in);

    @Override
    public void giveBankDetails() {
        System.out.println("Enter Account Number");
        long accno=scan.nextLong();
        setAccNumber(accno);

        System.out.println("Enter Account Holder Name");
        String customername=scan.next();
        setAccHolderName(customername);

        System.out.println("Enter Bank Name");
        String bankname=scan.next();
        setBankName(bankname);
    }

    @Override
    public String getCreditCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "+bname+ " bank is valid and authenticated for issuing the credit card. ");
    }
}
