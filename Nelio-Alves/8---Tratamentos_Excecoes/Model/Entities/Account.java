package Model.Entities;
import Model.Exception.DomainException;

public class Account {
    // ATRIBUTOS
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // CONSTRUTORES
    public Account() {
    }
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    // GETTERS & SETTERS
    public Integer getNumber() {
        return number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // MÉTODOS
    public void deposit(Double amount) {
        if (amount <= 0.00) {
            throw new DomainException("The deposit amount cannot be less than or equal to zero.");
        }
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > this.withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limit.");
        }
        if (amount > this.balance) {
            throw new DomainException("Not enough balance.");
        }
        if (amount <= 0.00) {
            throw new DomainException("The withdrawal amount cannot be less than or equal to zero.");
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", this.balance);
    }
}
