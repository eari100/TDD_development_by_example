package com.example.tdd_development_by_example.domain;

public class Money {
    protected int amount;

    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
