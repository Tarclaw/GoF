package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;

public abstract class BasicAccount implements Account {

    protected String accountNo;
    protected BigInteger accountBalance;

    public BasicAccount(String accountNo, BigInteger accountBalance) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public BigInteger getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigInteger accountBalance) {
        this.accountBalance = accountBalance;
    }
}
