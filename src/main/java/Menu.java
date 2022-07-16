import action.Decrypter;
import action.Encrypter;

import java.util.Scanner;

import static constants.Message.MENU;

public class Menu {
    public Menu () {
        System.out.println(MENU);
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> Encrypter.run();
            case 2 -> Decrypter.run();
        }
    }
}
