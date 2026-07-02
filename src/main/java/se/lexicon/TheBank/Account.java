package se.lexicon.TheBank;

public abstract class Account {

    private String holder;
    protected double balance; // to be able to access it from subclasses

    public Account(String holder, double balance) {
        if(holder == null || holder.isBlank() || balance < 0) throw new IllegalArgumentException("Holder name cannot be empty or balance cannot be negative.");
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount){
        if(amount < 0) throw new IllegalArgumentException("Amount cannot be negative.");
        balance += amount;
    }

    abstract void processMonth();

    void printSummary(){
        IO.println(getHolder() + " | Balance: " + getBalance() + " Kr");
    }
}
