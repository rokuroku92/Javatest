import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] score = {10, 20, 30, 50, 60, 70, 90};
        for (int i:score)
            System.out.println(i);
        System.out.println("----------------------------");
        Arrays.stream(score).forEach(System.out::println);
    }
}