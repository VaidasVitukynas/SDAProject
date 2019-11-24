package lt.sdacademy.Fundamentals.control_flow.switchcase;

public class Example1 {
    public static void main(String[] args) {
        char direction = 'w';

        switch (direction) {
            case 'n':
                System.out.println("Keliaujame siaures kryptimi!");
                break;
            case 's':
                System.out.println("Keliaujame pietu kryptimi!");
                break;
            case 'e':
                System.out.println("Keliaujame rytu kryptimi!");
                break;
            case 'w':
                System.out.println("Keliaujame vakaru kryptimi!");
                break;
            default:
                System.out.println("Keliaujame nezinoma kryptimi!");


        }
    }
}