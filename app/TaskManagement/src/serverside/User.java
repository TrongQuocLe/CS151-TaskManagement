package serverside;

import java.util.ArrayList;

// import com.google.gson.Gson;

import serverside.Exceptions.EmailException;
import serverside.Exceptions.EmailValidation;
import serverside.Exceptions.PasswordException;
import serverside.Exceptions.PasswordValidation;

public class User {
    private String firstName;
    private String lastName;
    private String userID;
    private char[] password;
    private String email;
    private String username;
    // private ArrayList<Workspace> workspaces;

    // // Default Constructor
    // public User(){
    // }

    // Parameterized Constructor to Create new User
    public User(String firstName, String lastName, String username, String email, char[] password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = UserDatabase.generateUniqueID(firstName, lastName);
        this.username = username;
        this.password = password;
    }

    // Shows current password
    public char[] getPassword() {
        return this.password;
    }

    // Get user id
    public String getUserID() {
        return this.userID;
    }

    // get user email
    public String getUserEmail() {
        return this.email;
    }

    // gets user full name
    public String getUserFullName() {
        return this.firstName + this.lastName;
    }

    // // Create Workspace
    // public void createWorkSpace(String name) {
    // Workspace newWorkspace = new SchoolWorkspace();
    // workspaces.add(newWorkspace);
    // }

    public static void main(String[] args) {
        char[] password = { 'b', 'l', 'a', 'k', 'a', 'w', 'k', '1', '2', '3', '4' };
        User kyle = new User("lo7kyle@gmail.com", "123$%SebasKyle", "Kyle", "Lo", password);
        System.out.println(kyle.getUserEmail());
        System.out.println(kyle.getPassword());
        System.out.println(kyle.getUserID());
        System.out.println(kyle.username);
        System.out.println(kyle.toString());
    }
}