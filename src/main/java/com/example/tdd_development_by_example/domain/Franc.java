package com.example.tdd_development_by_example.domain;

public class Franc extends Money {

    Franc(int amount) {
        this.amount = amount;
    }
    // 타락한 객체?
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
