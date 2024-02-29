package main.bugs.easy;

public class questionTwo {
    public static void main(String[] args) {
        int i = 0;
        while (i != 10) {
            i += 2;
            i %= 10; // Bug: 'i' never reaches 10 because of this
            System.out.println("i is " + i);
        }
    }
}
