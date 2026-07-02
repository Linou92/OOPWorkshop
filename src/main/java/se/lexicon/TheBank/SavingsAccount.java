package se.lexicon.TheBank;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void processMonth(){
        balance += balance * interestRate;
        IO.println(getHolder() + " interest credited.");
    }
}
