package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String NamesFile = "NamesFile.txt";
        String[] number = {"1, 2, 0", "4, 5"};

        List<String> namesFile = readNamesFromFile(NamesFile);
        List<String> namesWithWord = splitWords(namesFile);
        List<String> numbersWithWord = splitWords(Arrays.asList(number));
        System.out.println(numbersWithWord);

        List<String> numberCleaningAndSorted = numberSort(numbersWithWord);
        System.out.println(numberCleaningAndSorted);

        List<String> filteredNames = filterNames(namesWithWord);
        System.out.println(filteredNames);

        List<String> sortedUpperCaseNames = sortAndConvertToUpperCase(namesWithWord);
        System.out.println(sortedUpperCaseNames);

        RandomNumber randomNumberMethod = new RandomNumber();
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<Long> randomStream = createRandomNumber(a, c, m);
        randomStream.limit(10).forEach(System.out::println);

        Stream<Integer> first = Stream.of(11, 12, 13, 16);
        Stream<Integer> second = Stream.of(22, 54, 23, 65, 75, 15);
        Stream<Integer> merged = zipStreams(first, second);
        merged.forEach(System.out::println);
    }






    private static List<String> readNamesFromFile(String filename) {
        ReaderNamesFile readerNamesFile = new ReaderNamesFile();
        return readerNamesFile.namesReader(filename);
    }


    private static List<String> splitWords(List<String> inputList) {
        NamesWithout without = new NamesWithout();
        return without.splitWords(inputList);
    }


    private static List<String> numberSort(List<String> inputList) {
        Numbersort numerFilterandClen = new Numbersort();
        return numerFilterandClen.numberSort(inputList);
    }


    private static List<String> filterNames(List<String> inputList) {
        Names1357 namesFilter = new Names1357();
        namesFilter.filterNames(inputList);
        return namesFilter.namesOk;
    }


    private static List<String> sortAndConvertToUpperCase(List<String> inputList) {
        sortAndConvertToUpperCase nameProzesor = new sortAndConvertToUpperCase();
        return sortAndConvertToUpperCase.sortAndConvertToUpperCase(inputList);
    }


    private static Stream<Long> createRandomNumber(long a, long c, long m) {
        RandomNumber randomNumberMethod = new RandomNumber();
        return randomNumberMethod.creatRandomNumber(a, c, m);
    }


    private static Stream<Integer> zipStreams(Stream<Integer> first, Stream<Integer> second) {
        Iterator<Integer> iteratorFirst = first.iterator();
        Iterator<Integer> iteratorSecond = second.iterator();

        return Stream.generate(() -> {
                    if (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
                        return iteratorFirst.next();
                    } else {
                        return null; // Зупиняємо генерацію стріму, коли розмір `first` стає 0 або немає елементів у `second`
                    }
                }).takeWhile(Objects::nonNull) // Зупиняємо стрім, коли зустрічаємо null
                .flatMap(val -> {
                    if (iteratorSecond.hasNext()) {
                        return Stream.of(val, iteratorSecond.next());
                    } else {
                        return Stream.of(val);
                    }
                });
    }
}