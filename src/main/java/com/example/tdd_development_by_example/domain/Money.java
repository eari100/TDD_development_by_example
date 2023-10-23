package com.example.tdd_development_by_example.domain;

import com.example.tdd_development_by_example.util.Expression;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && currency().equals(money.currency);
    }

    public Sum plus(Money addend) {
        return new Sum(this, addend);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);

        return new Money(amount / rate, to);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
