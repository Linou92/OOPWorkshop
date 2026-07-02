package se.lexicon.TheBank;

public class CheckingAccount extends Account {

    private double monthlyFee;

    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    void processMonth(){
        balance -= monthlyFee;
        IO.println(getHolder() + " monthly fee charged.");
    }
}
