package com.example.tdd_development_by_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
// [완료] 5CHF x 2 = 10CHF
// Dollar/Franc 중복
// [완료] 공용 equals
// [완료] 공용 times
// [완료] Franc와 Dollar 비교하기
// [완료] 통화?
// [완료] testFrancMultiplication 제거
@SpringBootApplication
public class TddDevelopmentByExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TddDevelopmentByExampleApplication.class, args);
    }

}
