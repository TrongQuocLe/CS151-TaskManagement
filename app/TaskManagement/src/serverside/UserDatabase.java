package serverside;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Collections;

public class UserDatabase {
    // we use this class variable to count how many times this object was
    // instantiated
    private static int instantiationCounter = 0;
    private static HashMap<String, User> existingUsers = new HashMap<>();
    private static List<String> existingUsernames = new ArrayList<String>();
    private static String count = "0000";
    private static int counter = 0;
    private static volatile UserDatabase instance;

    private UserDatabase() {
        instantiationCounter++;
        // Default Constrcutor
    }

    public static UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }

    public static int getInstantiationCounter() {
        return instantiationCounter;
    }

    // creates a 4 digit counter
    private static void countUp() {
        if (9999 < counter) {
            return;
        }
        counter++;
        count = String.format("%04d", counter);
    }

    // Generate User ID
    public static String generateUniqueID(String firstname, String lastname) {
        // Get Initials. Deciding to use "" method because Name should be constant
        // however I understand we can use StringBuilder().append()
        char firstChar = firstname.charAt(0);
        char secondChar = lastname.charAt(0);
        String initials = firstChar + "" + secondChar;
        countUp();
        String userID = initials + "-" + count;
        return userID;

    }

    // method to save user to our database
    public static void saveUser(String email, User user) {
        existingUsers.put(email, user);

    }

    // method to save user email to our database
    public static void saveUsername(String username) {
        existingUsernames.add(username);
    }

    // method to delete user from our database
    public static void deleteUser(String userID) {
        existingUsers.remove(userID);
    }

    // Method return existing user profile
    public static User getUser(String email) {
        return existingUsers.get(email);
    }

    // Method to check password if it was the same as their previous
    public static boolean checkPasswordPrev(User user, String passwordField) {
        return (!Objects.equals(user.getPassword(), passwordField));

    }

    // Method to check username if already exists
    public static boolean checkEmailExist(String email) {
        if (existingUsers.containsKey(email)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check username if already exists
    public static boolean checkUsernameExist(String username) {
        int result = Collections.binarySearch(existingUsernames, username);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String userid = UserDatabase.generateUniqueID("Monster", "Engergy");
        System.out.println(userid);
        userid = UserDatabase.generateUniqueID("Electronic", "Duster");
        System.out.println(userid);
        // System.out.println(UserDatabase.getInstantiationCounter());
    }

}