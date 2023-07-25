package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String NamesFile = "NamesFile.txt";
        String[] number = { "1, 2, 0", "4, 5" };

        ReaderNamesFile readerNamesFile = new ReaderNamesFile();
        List<String> namesFile = readerNamesFile.namesReader(NamesFile);

        NamesWithout without = new NamesWithout();
        List<String> nameswithword = without.splitWords(namesFile);
        List<String> numberwithword = without.splitWords(List.of(number));
        System.out.println(numberwithword);

        numbersort numerFilterandClen = new numbersort();
        List<String> numbercliningandsorted = numbersort.numberSort(numberwithword);
        System.out.println(numbercliningandsorted);

        Names1357 namesFilter = new Names1357();
        namesFilter.filterNames(nameswithword);
        List<String> filteredNames = namesFilter.namesOk;
        System.out.println(filteredNames);

        sortAndConvertToUpperCase nameProzesor = new sortAndConvertToUpperCase();
        List<String> sortedUpperCaseNames = sortAndConvertToUpperCase.sortAndConvertToUpperCase(nameswithword);
        System.out.println(sortedUpperCaseNames);



        System.out.println(nameswithword.get(1));
    }
    }
