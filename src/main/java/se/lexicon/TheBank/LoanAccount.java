package se.lexicon.TheBank;

public class LoanAccount extends Account {

    private double loanRate;

    public  LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    @Override
    void processMonth(){
        balance += balance * loanRate;
        IO.println(getHolder() + " loan interest added.");
    }
}
