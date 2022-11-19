package serverside.Exceptions;

import java.util.Arrays;

public class UsernameValidation {
    public UsernameValidation() {
    }

    // A utility function to check
    // whether a password is valid or not
    public static void validate(String username) throws UsernameException {
        // for checking if password length
        // is between 8 and 15
        if (!((username.length() >= 5)
                && (username.length() <= 15))) {
            throw new Minimum5CharactersRequired();
        }

        // to check space
        if (username.contains(" ")) {
            throw new WhiteSpaceCheck2();
        }

        // for special characters
        if ((username.contains("@") || username.contains("#")
                || username.contains("!") || username.contains("~")
                || username.contains("$") || username.contains("%")
                || username.contains("^") || username.contains("&")
                || username.contains("*") || username.contains("(")
                || username.contains(")") || username.contains("-")
                || username.contains("+") || username.contains("/")
                || username.contains(":") || username.contains(".")
                || username.contains(", ") || username.contains("<")
                || username.contains(">") || username.contains("?")
                || username.contains("|"))) {
            throw new SpecialCharactersInvalid();
        }

    }

    // The password is valid
}
