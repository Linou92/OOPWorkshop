package se.lexicon.TheBank;

import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
    }

    void addAccount(Account account){
        accounts.add(account);
    }

    void processAllAccounts(){
        for(Account account:accounts){
            account.processMonth();
        }
    }

    void printAllSummaries(){
        for(Account account:accounts){
            account.printSummary();
        }
    }
}
