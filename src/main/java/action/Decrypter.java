package action;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import static constants.Alphabet.ALPHABET;

public class Decrypter {
    private static final String src = "text/encryptedText.txt";
    private static final String dest = "text/text.txt";

    public static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(dest)) {
            while (reader.ready()) {
                int symbol = reader.read();
                int symbolPosition = symbol - 'а';
                if (symbol >= 'а' && symbol <= 'я') {
                    int newSymbol = (symbolPosition - key) % 30 + 'а';
                    writer.write(newSymbol);
                } else {
                    writer.write(symbol);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
