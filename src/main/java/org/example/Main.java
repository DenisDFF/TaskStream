package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String NamesFile = "NamesFile.txt";

        ReaderNamesFile readerNamesFile = new ReaderNamesFile();
        List<String> namesFile = readerNamesFile.namesReader(NamesFile);

        NamesWithout without = new NamesWithout();
        List<String> nameswithword = without.splitWords(namesFile);

        Names1357 namesFilter = new Names1357();
        namesFilter.filterNames(nameswithword);
        List<String> filteredNames = namesFilter.namesOk;

        System.out.println(filteredNames);

    }
    }
