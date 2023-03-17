import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in en text med hjälp av en eller flera Scanner objekt och räkna:
        //   - Antal rader
        //   - Antal ord
        //   - Antal tecken

        int rows = 0;
        int words = 0;
        int characters = 0;

        Scanner rowsScanner = new Scanner(System.in);
        while (rowsScanner.hasNextLine()) {
            String row = rowsScanner.nextLine();
            rows++;
            characters += row.length();

            Scanner wordScanner = new Scanner(row);
            while (wordScanner.hasNext()) {
                wordScanner.next();
                words++;
            }
        }

        System.out.format("%8d%8d%8d", rows, words, characters);
    }
}