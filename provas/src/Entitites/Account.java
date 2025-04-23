package Entitites;

public class Account {
    public String name;
    private int numAccount;
    private Double balance;

    public Account() {
    }

    public Account(String name, int numAccount) {
        this.name = name;
        this.numAccount = numAccount;
        balance = 0.0;
    }


    public Account(String name, int numAccount, Double balance) {
        this.name = name;
        this.numAccount = numAccount;
        this.balance = balance;
    }

    public int getNumAccount() {
        return numAccount;
    }


    public Double getBalance() {
        return balance;
    }


    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", numAccount=" + getNumAccount() +
                ", balance=" + getBalance() +
                '}';
    }

    public Double Deposite (Double deposite){
        balance += deposite;
        return balance;
    }
    public Double WithDraw(Double withDraw){
        balance = (balance - withDraw) - 5;
        return balance;
    }
}
