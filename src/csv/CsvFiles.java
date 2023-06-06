package csv;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CsvFiles {
    public static void main(String[] args) {
        try {
//            readCsvFileWithScanner(file);
            readCsvFileWithBufferedReader();
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static void readCsvFileWithScanner() throws IOException {
        File file = new File("./src/csv/worldcities.csv");

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void readCsvFileWithBufferedReader() throws  IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/csv/worldcities.csv"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] values = line.split(",");
                line = bufferedReader.readLine();
                System.out.println(Arrays.toString(values));
            }
        }
    }
}
