package lt.sdacademy.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);
        boolean calculateOn = true;
        double result = 0;

        while (calculateOn) {

            double firstNum = getNum("Įveskite pirmą skaičių");

            double secondNum = getNum("Įveskite antrą skaičių");

            System.out.println("Pasirinkite, kokį veiksmą norite daryti: + - * /");
            String action = actionScanner.nextLine();

            result = getResult(action, firstNum, secondNum); // funkcija!

            System.out.println("Gautas rezultatas: " + result);

            System.out.println("Jei norite skaičiuoti dar kartą įveskite: TAIP, kitu atveju NE");
            String userAnswerOnCalculation = actionScanner.nextLine();

            if (userAnswerOnCalculation.equalsIgnoreCase("NE")) {
                calculateOn = false;
            }
        }
    }

    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }

    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return num1 + num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return num1 / num2;
            }
            default: {
                System.out.println("Veiksmas nebuvo rastas");
                return 0;
            }
        }
    }
}