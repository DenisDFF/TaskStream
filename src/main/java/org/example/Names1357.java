package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Names1357 {
    List<String> namesOk = new ArrayList<>();

    public List<String> filterNames(List<String> namesWithWord) {
        return IntStream.range(0, namesWithWord.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(namesWithWord::get)
                .collect(Collectors.toList());
    }
    }
