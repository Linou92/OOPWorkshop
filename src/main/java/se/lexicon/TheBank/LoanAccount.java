package se.lexicon.TheBank;

public class LoanAccount extends Account {

    private double loanRate;

    public  LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    void processMonth(){
        double balance = getBalance();
        balance += balance * loanRate;
        IO.println("Holder : " + getHolder() + " loan interest added.");
    }
}
