package se.lexicon.TheBank;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }

    void processMonth(){
        double balance = getBalance();
        balance += balance * interestRate;
        IO.println("Holder : " + getHolder() + " loan interest added.");
    }
}
