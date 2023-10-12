package com.example.tdd_development_by_example.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DollarTests {

    // todo:
    // $5 + 10CHF = $10 (환율이 2:1일 경우)
    // [완료] $5 * 2 = $10
    // amount를 private로 만들기
    // [완료] Dollar side effect?
    // Money 반올림?
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
    }
}
