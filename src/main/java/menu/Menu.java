package menu;

import action.InputCheck;
import constants.Message;

import java.util.InputMismatchException;

import static constants.Message.MENU;

public class Menu {
    public Menu () {
        System.out.println(MENU);
        while (true) {
            try {
                InputCheck.menuCheck();
                break;
            } catch (InputMismatchException e) {
                System.err.println(Message.ENTER_NUMBER);
            }
        }
    }
}
