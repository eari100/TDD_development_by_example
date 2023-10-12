package com.example.tdd_development_by_example.domain;

public class Dollar {

    // todo:
    // $5 + 10CHF = $10 (환율이 2:1일 경우)
    // $5 * 2 = $10 (제일 쉬운 것)
    // amount를 private로 만들기
    // Dollar side effect?
    // Money 반올림?
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.time(2);
        assertEquals(10, five.amount);
    }
}
