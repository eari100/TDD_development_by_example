package com.example.tdd_development_by_example.domain;

public class Franc {
    Franc(int amount) {
        this.amount = amount;
    }

    private int amount;

    // 타락한 객체?
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }
}
