package action;

import constants.Alphabet;
import constants.Message;

import java.io.FileReader;
import java.io.FileWriter;

public class Decrypter {

    public Decrypter() {
        System.out.println(Message.DIRECTORY_TO_DECRYPT);
        String fileName = InputCheck.directoryCheck();
        System.out.println(Message.DIRECTORY_RESULT);
        String resultFileName = InputCheck.directoryCheck();
        Decrypter.run(fileName, resultFileName);
    }

    private static void run(String fileName, String resultFileName) {

        System.out.println(Message.ENTER_THE_KEY);
        int key = InputCheck.keyCheck();
        try (FileReader reader = new FileReader(fileName);
             FileWriter writer = new FileWriter(resultFileName)) {
            while (reader.ready()) {
                char symbol = (char)reader.read();
                if (Alphabet.ALPHABET.contains(symbol)) {
                    if (Alphabet.ALPHABET.indexOf(symbol) - key < 0) {
                        writer.write(Alphabet.ALPHABET.get(Alphabet.ALPHABET.indexOf(symbol) - key + Alphabet.ALPHABET.size()));
                    } else {
                        writer.write(Alphabet.ALPHABET.get(Alphabet.ALPHABET.indexOf(symbol) - key));
                    }
                } else {
                    writer.write(symbol);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

