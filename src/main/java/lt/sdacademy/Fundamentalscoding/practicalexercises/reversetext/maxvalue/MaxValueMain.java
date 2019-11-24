package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.maxvalue;

import java.util.Scanner;

public class MaxValueMain {
    public static void main(String [] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu sarasa");
        String  numbersInText = inputScanner.nextLine();
        String[] numberArr = numbersInText.split("");
        int max = Integer.parseInt(numberArr[0]);
        for (int i = 0; i <= numberArr.length; i++){
            int number = Integer.parseInt(numberArr[i]);
            if (number > max) {
                max = number;
            }
        }
            System.out.println("Maksimali reiksme is saraso yra: + max");
    }
}


