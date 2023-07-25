package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class ReaderNamesFile {
    public List<String> namesReader(String NamesFile) {
        try {
            return Files.readAllLines(Paths.get(NamesFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
