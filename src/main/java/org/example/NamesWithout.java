package org.example;

import java.util.ArrayList;
import java.util.List;

public class NamesWithout {
    public List<String> splitWords(List<String> lines) {
        List<String> wordsList = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordsList.add(word);
            }
        }
        return wordsList;
    }
}
