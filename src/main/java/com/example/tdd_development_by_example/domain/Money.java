package com.example.tdd_development_by_example.domain;

public abstract class Money {
    protected int amount;

    abstract Money times(int multiplier);
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    static Franc franc(int amount) {
        return new Franc(amount);
    }
}
