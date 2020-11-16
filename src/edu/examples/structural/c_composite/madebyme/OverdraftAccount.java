package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;

public class OverdraftAccount extends BasicAccount {

    private final Integer INTEREST = 1;

    public OverdraftAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        System.out.println("Overdraft Account № " + accountNo + " balance:");
        return accountBalance.multiply(BigInteger.valueOf(INTEREST)).divide(BigInteger.valueOf(103L));
    }
}
