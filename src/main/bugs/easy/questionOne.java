package main.bugs.easy;

import java.util.ArrayList;
import java.util.List;

public class questionOne {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("First line.\nSecond line.");
        lines.add("Third line.\nFourth line.");

        System.out.println("Attempting to print lines with newline characters:");
        lines.forEach(line -> System.out.println(processLine(line)));
    }

    /**
     * Intended to process and return each line, but mistakenly removes newlines when trying to trim whitespace.
     * Solution: replace '\n' with ' '
     */
    private static String processLine(String line) {
        return line.replaceAll("\\s+$", "").replace("\n", " ");
    }
}
