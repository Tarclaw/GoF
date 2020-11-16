package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;

public class TerminalMenu {
    public static void main(String[] args) {
        CompositeAccount compositeAccount = new CompositeAccount();
        compositeAccount.addAccount(new DepositeAccount("DA001", BigInteger.valueOf(5000L)));
        compositeAccount.addAccount(new EnterpriseAccount("EA002", BigInteger.valueOf(50000000L)));
        compositeAccount.addAccount(new OverdraftAccount("OA003", BigInteger.valueOf(1000L)));
        compositeAccount.addAccount(new SavingAccount("SA004", BigInteger.valueOf(9000L)));

        System.out.println("Total Balance: " + compositeAccount.calculateInterest().toString());
    }
}
