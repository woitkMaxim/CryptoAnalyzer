package action;

import constants.Message;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCheck {

    public static String directoryCheck() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        String fileName;
        while (true) {
            fileName = scanner.nextLine();
            if (Files.exists(Path.of(fileName))) {
                break;
            } else {
                System.err.println(Message.INCORRECT_DIRECTORY);
            }
        }
        return fileName;
    }

    public static int keyCheck() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int key;
        while (true) {
            try {
                key = scanner.nextInt();

                if (key >= 1 && key <= 75) {
                    break;
                } else {
                    System.err.println(Message.INCORRECT_KEY);
                }
            } catch (InputMismatchException e) {
                System.err.println(Message.INCORRECT_KEY);
                scanner.next();
            }
        }
        return key;
    }

    public static void menuCheck() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        int choice;
        while (true) {
            while (true) {
                try {
                    choice = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println(Message.ENTER_NUMBER);
                    scanner.next();
                }
            }
            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1 -> new Encrypter();
                    case 2 -> new Decrypter();
                    case 3 -> System.out.println(Message.EXIT);
                }
                break;
            } else {
                System.err.println(Message.INCORRECT_MENU);
            }
        }
    }
}
