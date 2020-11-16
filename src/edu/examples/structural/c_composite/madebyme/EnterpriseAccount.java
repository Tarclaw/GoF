package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;

public class EnterpriseAccount extends BasicAccount {

    private final Integer INTEREST = 7;

    public EnterpriseAccount(String accountNo, BigInteger accountBalance) {
        super(accountNo, accountBalance);
    }

    @Override
    public BigInteger calculateInterest() {
        System.out.println("Enterprise Account № " + accountNo + " balance:");
        return accountBalance.multiply(BigInteger.valueOf(INTEREST)).divide(BigInteger.valueOf(99L));
    }
}
