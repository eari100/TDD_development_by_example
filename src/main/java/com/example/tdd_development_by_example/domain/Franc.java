package com.example.tdd_development_by_example.domain;

public class Franc extends Money {
    Franc(int amount, String currency) {
        super(amount, currency);
    }
    // 타락한 객체?
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
