import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = scanner.nextInt();
       int alleNumber = IntStream.rangeClosed(1, N).filter(vol -> vol % 2 == 0).map(vol -> vol * vol).sum();
        System.out.println(alleNumber);

    }
}
