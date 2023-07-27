package org.example;

import java.util.stream.Stream;

public class Peremishaty {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return Stream.concat(first, second);
    }
}
