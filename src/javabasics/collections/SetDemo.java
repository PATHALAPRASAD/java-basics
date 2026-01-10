package javabasics.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Create a Set using the HashSet implementation
        Set<String> uniqueNames = new HashSet<>();

        // Add elements to the set
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Charlie");
        uniqueNames.add("Alice"); // Attempting to add a duplicate (ignored)

        // Print the set elements
        System.out.println("Set elements: " + uniqueNames);

        // Check if an element exists
        boolean containsBob = uniqueNames.contains("Bob");
        System.out.println("Does the set contain Bob? " + containsBob);

        // Iterate through the elements using an enhanced for loop
        System.out.print("Names in the set: ");
        for (String name : uniqueNames) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Remove an element
        uniqueNames.remove("Bob");
        System.out.println("Set after removing Bob: " + uniqueNames);
    }
}