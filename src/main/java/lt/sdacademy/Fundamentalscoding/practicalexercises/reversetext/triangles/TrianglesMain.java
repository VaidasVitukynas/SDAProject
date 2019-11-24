package lt.sdacademy.Fundamentalscoding.practicalexercises.reversetext.triangles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesMain {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\Intruduction seminar\\src\\main\\java\\lt\\sdacademy\\Fundamentalscoding\\practicalexercises\\reversetext\\triangles\\trianglesData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\Intruduction seminar\\src\\main\\java\\lt\\sdacademy\\Fundamentalscoding\\practicalexercises\\reversetext\\triangles\\Result.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile();

        countTrianglesPerimeter(triangles);
        writeTrianglePerimeter(triangles);
    }

    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangles = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                triangles.add(mapInfoToTriangle(line));
                line = br.readLine();
            }

        } catch (IOException exception) {
            System.out.println("Eror while reading file");
        }
        return triangles;
    }

    private static Triangle mapInfoToTriangle(String line) {
        String[] splittedData = line.split(",");
        return new Triangle(
                Integer.parseInt(splittedData[0]),
                Integer.parseInt(splittedData[1]),
                Integer.parseInt(splittedData[2]),
                TriangleType.valueOf(splittedData[3])
        );
    }

    private static void countTrianglesPerimeter(List<Triangle> triangles) {
        int perimeter;

        for (Triangle triangle : triangles) {
            perimeter = triangle.getA() + triangle.getB() + triangle.getC();
            triangle.setPerimeter(perimeter);
        }
    }


    private static void writeTrianglePerimeter(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                bw.write("Trikampio tipas " + t.getTriangleType().getTriangleDescription() + " perimetras: " + t.getPerimeter());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila");
        }
    }

}