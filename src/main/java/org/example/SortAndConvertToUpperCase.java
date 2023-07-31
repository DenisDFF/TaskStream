package org.example;

import java.util.Collections;
import java.util.List;

    public class SortAndConvertToUpperCase {
        public static List<String> sortAndConvertToUpperCase(List<String> namesWithWord) {
            return namesWithWord.stream()
                    .map(String::toUpperCase)
                    .sorted(Collections.reverseOrder())
                    .toList();
        }
    }

