package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.factorial;

import java.util.Scanner;

public class factorialMain {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
            int result = 1;
                System.out.println("Iveskite skaiciu");
                int input = inputScanner.nextInt();

                for (int i = 1; i <= input; i++) {
                    result *= i;
            }
             System.out.println("Faktorialo:" + input + " rezultatas yra =" + result);
    }
}
