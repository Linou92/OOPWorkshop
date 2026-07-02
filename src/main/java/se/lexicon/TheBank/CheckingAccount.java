package se.lexicon.TheBank;

public class CheckingAccount extends Account {

    private double monthlyFee;

    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }

    void processMonth(){
        double balance = getBalance();
        balance -= monthlyFee;
        IO.println("Holder : " + getHolder() + " monthly fee charged.");
    }
}
