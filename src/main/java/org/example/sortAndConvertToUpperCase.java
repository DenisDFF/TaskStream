package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

    public class sortAndConvertToUpperCase {
        public static List<String> sortAndConvertToUpperCase(List<String> nameswithword) {
            List<String> result = new ArrayList<>();
            for (String s : nameswithword) {
                result.add(s.toUpperCase());
            }
            Collections.sort(result, Collections.reverseOrder());
            return result;
        }
    }

