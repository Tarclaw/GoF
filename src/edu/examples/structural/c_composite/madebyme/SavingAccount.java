package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;

public class SavingAccount extends BasicAccount {

    private final Integer INTEREST = 15;

    public SavingAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        System.out.println("Saving Account № " + accountNo + " balance:");
        return accountBalance.multiply(BigInteger.valueOf(INTEREST)).divide(BigInteger.valueOf(101L));
    }
}
