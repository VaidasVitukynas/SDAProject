package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.averagecalculator;

import java.util.Arrays;
import java.util.List;

public class AverageCalculatorMain {
    public static void main (String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 48, 88, 5);

        int sum = 0;
        // double average = 0;

        for (Integer number : integers) {
            sum += number;
        }
        System.out.println(sum);
        double average = (double) sum / integers.size();
        //average = sum / integers.size();
        // printf - eilute su parametru
        System.out.printf("Vidurkis: %.2f", average);
    }
}
