package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesWithout {
    public List<String> splitWords(List<String> lines) {
        return lines.stream()
                .flatMap(line -> Arrays.stream(line.split("\\s+")))
                .map(word -> word.replace(",", ""))
                .collect(Collectors.toList());
    }
}
