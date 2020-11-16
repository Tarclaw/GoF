package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;

public class DepositeAccount extends BasicAccount {

    private final Long INTEREST = 5L;

    public DepositeAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        System.out.println("Deposite Account № " + accountNo + " balance:");
        return accountBalance.multiply(BigInteger.valueOf(INTEREST)).divide(BigInteger.valueOf(100L));
    }
}
