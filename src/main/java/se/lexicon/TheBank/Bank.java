package se.lexicon.TheBank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    void processAllAccounts(){
        for(Account account:accounts){
            account.processMonth();
        }
    }

    void printAllSummaries(){
        IO.println(String.format("""
                %s
                ===== Account Summary =====
                """, name));
        for(Account account:accounts){
            account.printSummary();
        }
    }
}
