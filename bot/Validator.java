package bot;

public class Validator {

    public static boolean stringIsNotEmpty(String string) {
        if (string == null) {
            throw new NullPointerException("String is null");
        }
        return !string.trim().isEmpty();
    }

    public static boolean integerIsPositiveOrZero(int integer) {
        return integer >= 0;
    }

    public static boolean integerIsPositive(int integer) {
        return integer > 0;
    }
}

