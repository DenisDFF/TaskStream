package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names1357 {
    List<String> namesOk = new ArrayList<>();

    public String filterNames(List namesWithWord) {
        return IntStream.range(0, namesWithWord.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + namesWithWord.get(i))
                .collect(Collectors.joining(", "));
    }
    }
