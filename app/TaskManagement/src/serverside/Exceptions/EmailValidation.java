package serverside.Exceptions;

import java.util.regex.Pattern;

public class EmailValidation {
    public EmailValidation() {
        // Default Constuctor
    }

    public static boolean patternMatching(String email, String regexPattern) {
        // Todo: email check exceptions
        return Pattern.compile(regexPattern).matcher(email).matches();
    }

    public static void validate(String email) throws EmailException {

        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if (!patternMatching(email, regexPattern)) {
            throw new EmailException();
        } else {
            // System.out.println("Email is valid");
        }
    }

    public static void main(String[] args) {
        try {
            String email = "kylelo@sjsu.edu";
            System.out.println("Is the email: " + email + " valid?");

            EmailValidation.validate(email);
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }
    }

}
