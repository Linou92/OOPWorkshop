package se.lexicon.TheBank;
/*
1. How does Java know which processMonth() to run?

This is polymorphism. The Bank stores all accounts in a List<Account>,
but each object is actually a SavingsAccount, CheckingAccount,
or LoanAccount. When account.processMonth() is called, Java
uses dynamic method dispatch to invoke the overridden method
belonging to the object's actual type.

2. Why can't you write new Account("Ali", 1000)?

Because Account is an abstract class. Abstract classes cannot
be instantiated directly. They serve as a common base class that
defines shared fields and methods, while requiring subclasses
to implement abstract methods such as processMonth().
 */

public class BankApp {

    public static void runApp(){
        Bank bank = new Bank("Lexicon Bank");
        bank.addAccount(new SavingsAccount("Sara",1000, 0.02));
        bank.addAccount(new CheckingAccount("Ali", 500, 25));
        bank.addAccount(new LoanAccount("Adam", 5000, 0.03));
        IO.println("Starting balances...");
        bank.printAllSummaries();
        IO.println("Processing accounts...");
        bank.processAllAccounts();
        IO.println("Updated balances...");
        bank.printAllSummaries();
    }
}
