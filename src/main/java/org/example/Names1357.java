package org.example;

import java.util.ArrayList;
import java.util.List;

public class Names1357 {
    List<String> namesOk = new ArrayList<>();

    public void filterNames(List<String> nameswithword) {
        for (int i = 0; i < nameswithword.size(); i++) {
            if (i % 2 != 0) {
                namesOk.add(nameswithword.get(i));
            }
        }
}
    }
