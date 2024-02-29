package main.bugs.easy;

import java.util.ArrayList;
import java.util.List;

public class questionOne {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("First line.\nSecond line.");
        lines.add("Third line.\nFourth line.");

        System.out.println("Attempting to print lines with newline characters:");
        for (String line : lines) {
            // Bug: Newline characters are ignored due to incorrect processing
            System.out.println(line.replaceAll("\n", ""));
        }
    }
}
