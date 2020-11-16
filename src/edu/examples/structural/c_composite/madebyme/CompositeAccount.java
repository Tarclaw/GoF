package edu.examples.structural.c_composite.madebyme;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CompositeAccount implements Account {

    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public BigInteger calculateInterest() {
        BigInteger result = BigInteger.valueOf(0L);
        for (Account account : accounts) {
            result = result.add(account.calculateInterest());
        }
        return result;
    }
}
