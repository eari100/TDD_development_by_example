package com.example.tdd_development_by_example.domain;

// todo:
// $5 + 10CHF = $10 (환율이 2:1일 경우)
// [완료] $5 * 2 = $10
// [완료] amount를 private로 만들기
// [완료] Dollar side effect?
// Money 반올림?
// [완료] equals
// hashcode
// Equal null
// Equal object
// 5CHF x 2 = 10CHF
public class Dollar {

    Dollar(int amount) {
        this.amount = amount;
    }

    private int amount;

    // 타락한 객체?
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }
}
