package lt.sdacademy.Fundamentals.file_reader.scanner;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.Fundamentals.file_reader.Util.FILE_LOCATION;

public class ScannerExampleMain {
    public static void main(String[] args) {

        try {
            Scanner fileScanner = new Scanner(new  File(FILE_LOCATION));
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");
        }
    }
}
