package javabasics.streamapi;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculatePower {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).map(a -> a * a).forEach(System.out::println);
        printLine();

//        IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList()).stream().map(a -> a * a).forEach(System.out::println);
//        removed collect(Collectors.toList()) with toList()
        IntStream.rangeClosed(1, 10).boxed().toList().stream().map(a -> a * a).forEach(System.out::println);
    }

    private static void printLine() {
        System.out.println("-".repeat(50));
    }
}
