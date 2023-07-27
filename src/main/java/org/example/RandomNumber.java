package org.example;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class RandomNumber {
    public static Stream<Long> creatRandomNumber (long a, long c, long m) {
        UnaryOperator<Long> nextNumber = x -> (a * x + c) % m;
        return Stream.iterate(1L, nextNumber);
    }
}
