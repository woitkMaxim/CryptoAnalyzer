package action;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import static constants.Message.ENTER_THE_KEY;

public class Encrypter {

    private static final String src = "text/text.txt";
    private static final String dest = "text/encryptedText.txt";

    public static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println(ENTER_THE_KEY);
        int key = scanner.nextInt();
        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(dest)) {
            while (reader.ready()) {
                int symbol = reader.read();
                int symbolPosition = symbol - 'а';
                if (symbol >= 'а' && symbol <= 'я') {
                    int newSymbol = (symbolPosition + key) % 30 + 'а';
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
