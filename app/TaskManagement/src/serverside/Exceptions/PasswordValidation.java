package serverside.Exceptions;

import serverside.WhiteSpaceCheck;

public class PasswordValidation {
    public PasswordValidation(){
    }

    // A utility function to check
    // whether a password is valid or not
    public static void validate(String password) throws PasswordException{
        // for checking if password length
        // is between 8 and 15
        if (!((password.length() >= 8)
              && (password.length() <= 15))) {
            throw new Minimum8CharactersRequired();
            }
        
        // to check space
        if (password.contains(" ")) {
            throw new WhiteSpaceCheck();
        }
        if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new NumberCharacterMissing();
            }
        }
  
        // for special characters
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            throw new SpecialCharacterMissing();
        }
  
        if (true) {
            int count = 0;
  
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new UpperCaseCharacterMissing();
            }
        }
  
        if (true) {
            int count = 0;
  
            // checking small letters
            for (int i = 90; i <= 122; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new LowerCaseCharacterMissing();
            }
        }
    }
  
        // The password is valid
  
    // Driver code
    public static void main(String[] args)
    {
        String password1 = "123sebasKyle";
        try {
            System.out.println("Is Password "
                               + password1 + " valid?");
            validate(password1);
            System.out.println("Valid Password");
        }
        catch (PasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
        String password2 = "Geek007@GFG";
        try {
            System.out.println("\nIs Password "
                               + password2 + " valid?");
            validate(password2);
            System.out.println("Valid Password");
        }
        catch (PasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }
}

