package se.lexicon.TheBank;

public abstract class Account {

    private String holder;
    private double balance;

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
        IO.println(String.format("""
                ===== Account Summary ====
                Holder: %s
                Balance: %.2f Kr
                """));
    }
}
