package com.example.tdd_development_by_example.domain;

public class Dollar {

    Dollar(int amount) {
        this.amount = amount;
    }

    public int amount;

    // 타락한 객체?
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
