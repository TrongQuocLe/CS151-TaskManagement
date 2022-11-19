package serverside.Exceptions;

public class UsernameException extends Exception {

    int usernameConditionViolated = 0;

    // Default Constructor
    public UsernameException() {
    }

    public UsernameException(int conditionViolated) {
        super("Invalid Username: ");
        usernameConditionViolated = conditionViolated;
    }

    // Error Message for when one of the conditions are violated
    public String printMessage() {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (usernameConditionViolated) {

            // Username length should be
            // between 8 to 15 characters
            case 1:
                return ("Username length should be"
                        + " between 5 to 15 characters");

            // Username should not contain any space
            case 2:
                return ("Username should not"
                        + " contain any space");

            // Username shouldn't contain
            // special characters ( @, #, %, &, !, $ )
            case 3:
                return ("Username should not contain"
                        + " special characters");

        }

        return ("");
    }

}
