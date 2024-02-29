package main.bugs.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class questionOne {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Attempt to convert a list to an array using toArray()
        Object[] arrayFromList = list.toArray();
        System.out.println("Array from List using toArray(): " + Arrays.toString(arrayFromList));

        // One might think Arrays.asList() is the reverse of List.toArray()
        // But Arrays.asList() is used for creating a fixed-size list from an array
        List<String> newList = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println("List from Array using Arrays.asList(): " + newList);

        // Incorrect assumption: modifying the original array doesn't affect the list created with Arrays.asList()
        // TDLR: Arrays.asList() does not create a new instance, but just a reference
        String[] array = new String[] { "Apple", "Banana", "Cherry" };
        List<String> linkedList = Arrays.asList(array);
        array[0] = "Apricot";
        System.out.println("Modified array: " + Arrays.toString(array));
        System.out.println("List reflecting changes: " + linkedList);
    }
}
