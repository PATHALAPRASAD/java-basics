package javabasics.streamapi;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> names = List.of("Prasad", "Anil", "Sai", "Sarath");
        System.out.println(names);
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseNames);
        List<String> lowerCaseNames = names.stream().map(String::toLowerCase).toList();
        System.out.println(lowerCaseNames);
        List<Integer> namesLengths = names.stream().map(String::length).toList();
        System.out.println(namesLengths);
        System.out.println(names.stream().map(name -> name.substring(2)).toList());
    }
}
