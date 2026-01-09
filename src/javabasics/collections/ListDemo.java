package javabasics.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        System.out.println(numbers);

        List<String> names = new ArrayList<>();
        names.add("prasad");
        names.add("hema");
        names.add("srinu");
        System.out.println(names);

        System.out.println(IntStream.range(1, 11).boxed().toList());

        IntStream.range(1, 21).boxed().map(n->n*n).toList().forEach(System.out::println);
    }
}
