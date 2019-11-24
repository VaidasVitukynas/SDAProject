package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.windspeed;

import java.util.Scanner;

public class WindSpeedMain {
    static final double NAUTIC_MILE = 1.852;
    static final double BEAUFORT_CONSTANT = 3.01;
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Iveskite vejo greiti km/h");
        int winspeed = inputScanner.nextInt();



        System.out.printf("Vejo greitis mamazgais: %.1f ", winspeed * NAUTIC_MILE);
        System.out.printf("Vejo greitis Beuferto skaleje: %.1f", Math. pow(winspeed / BEAUFORT_CONSTANT, 1.5));
        System.out.print("Vejo stiprumas: ");

        if (winspeed > 20) {
            System.out.println("Stiprus");
        } else {
            System.out.println("Silpnas");
        }


    }
    private static int kilometersPerHourToKnots(int windSpeed) {
        return (int) (NAUTIC_MILE * windSpeed);
    }

    private static int kilometersPerHourToBeaufortScale(int windspeed) {
        int beaufort = (int) Math.pow(windspeed / BEAUFORT_CONSTANT, 1.5);
        return Math.min(beaufort, 12);
    }

    private static String getWindStrenght(int windSpeed) {
        return  windSpeed <= 20 ? "ramus " : "stiprus";


    }

}
