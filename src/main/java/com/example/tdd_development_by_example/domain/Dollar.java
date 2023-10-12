package com.example.tdd_development_by_example.domain;

public class Dollar {

    Dollar(int amount) {
        this.amount = amount;
    }

    public int amount;

    void times(int multiplier) {
        amount *= multiplier;
    }
}
