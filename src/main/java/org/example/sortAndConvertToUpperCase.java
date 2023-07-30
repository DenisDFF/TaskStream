package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

    public class sortAndConvertToUpperCase {
        public static List<String> sortAndConvertToUpperCase(List<String> namesWithWord) {
            return namesWithWord.stream()
                    .map(String::toUpperCase)
                    .sorted(Collections.reverseOrder())
                    .toList(); // Якщо ви використовуєте Java 16+
        }
    }

