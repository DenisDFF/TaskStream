package org.example;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

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

        RandomNumber randomNumberMethod = new RandomNumber();

        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> Randomaiz = randomNumberMethod.creatRandomNumber(a, c, m);
        Randomaiz.limit(10).forEach(System.out::println);

        Stream<Integer> first = Stream.of(11, 12, 13, 16);
        Stream<Integer> second = Stream.of(22,54,23,65);


        Peremishaty mergedit = new Peremishaty();

        Stream<Integer> Merget = mergedit.zip(first, second);
        Merget.forEach(System.out::println);
    }
    }
