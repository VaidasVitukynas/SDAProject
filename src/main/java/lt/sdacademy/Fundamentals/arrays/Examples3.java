package lt.sdacademy.Fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class Examples3 {
    public static void main(String [] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};

        System.out.println(arrayOfInts [0]); // prints 10
        System.out.println(arrayOfInts [2]); // prints 20
        System.out.println(arrayOfInts [4]); // prints 30

        // Isspausdinus 10 15 20 25 30
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i] + "");
        }
        System.out.println(); // Spausdinama tuscia eilute

        // Isspausdinus 10 05 20 25 30
        for (int i : arrayOfInts) {
            System.out.println(i + "");
        }

        System.out.println();

        List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30);
        integerList.forEach(number -> System.out.print(number + " "));

    }
}
