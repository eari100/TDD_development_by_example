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
// [완료] 공용 equals
// 공용 times
// [완료] Franc와 Dollar 비교하기
// [완료] 통화?
// testFrancMultiplication 제거
public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    // 타락한 객체?
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
