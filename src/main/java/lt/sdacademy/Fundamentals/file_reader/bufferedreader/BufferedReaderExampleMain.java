package lt.sdacademy.Fundamentals.file_reader.bufferedreader;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static lt.sdacademy.Fundamentals.file_reader.Util.FILE_LOCATION;

public class BufferedReaderExampleMain {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            StringBuilder stringBuilder = new StringBuilder();

            String line;

            while (true){
                line = br.readLine();
                if (line == null) {
                    break;
                }
                stringBuilder.append(line);
            }

            /*do {                              // uzsikomentuojam,kad nespausdintu null
                line = br.readLine();
                stringBuilder.append(line);
            } while (line != null);*/

            System.out.println(stringBuilder.toString());

            br.close();
        } catch (IOException e) { //input, output exeption
            e.printStackTrace();
        }
    }
}

