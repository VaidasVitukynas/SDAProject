package lt.sdacademy.Fundamentals.object_oriented.Bicycle.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kambario ilgi");
        int widht = scanner.nextInt();

        System.out.println("Iveskite kambario ploti");
        int lenght = scanner.nextInt();

        Room room = new Room(widht, lenght);

        int squareOfRomm = getSquareOfRoom(room.getLenght(), room.getWidth());
        System.out.println("Kambario plotas:" + squareOfRomm);
    }
    private static int getSquareOfRoom(int lenght, int width) {
        return (lenght * width);
    }
}
