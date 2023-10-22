package com.example.tdd_development_by_example.util;

import com.example.tdd_development_by_example.domain.Money;

public interface Expression {
    Money reduce(String to);
}
