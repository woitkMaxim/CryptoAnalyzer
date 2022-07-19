package constants;

public class Message {

    public static final String MENU = """
            ************************************
                            
            Выберите, что вы хотите сделать:
            1. Зашифровать текст
            2. Дешифровать текст
            3. Выйти из программы
                            
            ************************************""";

    public static final String ENTER_THE_KEY = "Введите ключ. Допустимые значения 1-75";

    public static final String DIRECTORY_TO_ENCRYPT = "Введите путь к файлу,  который хотите зашифровать";

    public static final String DIRECTORY_RESULT = "Введите путь к файлу, в который нужно сохранить результат";
    public static final String INCORRECT_DIRECTORY = "Введён некорректный путь к файлу, попробуйте снова";
    public static final String INCORRECT_KEY = "Некорректное значение. Введите цифру от 1 до 75";
    public static final String DIRECTORY_TO_DECRYPT = "Введите путь к файлу, который хотите дешифровать";
    public static final String EXIT = "Вы вышли из программы";
    public static final String INCORRECT_MENU = "Такого пункта в меню нет. Введите корректное число";
    public static final String ENTER_NUMBER = "Введите число";
}
