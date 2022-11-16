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
    private String password;
    private String email;
    private String username;
    private ArrayList<Workspace> workspaces;

    // // Default Constructor
    // public User(){
    // }

    // Parameterized Constructor to Create new User
    public User(String email, String password, String firstName, String lastName, String username) {
        validateEmail(email);
        validatePassword(password);
        this.firstName = firstName;
        this.lastName = lastName;
        getUserFullName();
        this.userID = UserDatabase.generateUniqueID(firstName, lastName);
        this.username = username;
    }
    // public String toString(){//overriding the toString() method
    // return rollno+" "+name+" "+city;
    // }

    // Validate password. I want this to be handled here before it gets saved into
    // the database
    public void validatePassword(String password) {
        try {
            PasswordValidation.validate(password);
            // System.out.println("Valid Password");
            this.password = password;
        } catch (PasswordException e) {
            System.out.print(e.getMessage());
            System.out.println(e.printMessage());
        }
    }

    // Validates the email:
    public void validateEmail(String email) {
        try {
            EmailValidation.validate(email);
            // System.out.println("Valid Email");
            this.email = email;
        } catch (EmailException e) {
            System.out.print(e.getMessage());
        }
    }

    // Change Password Method
    public void changePassword(String password) {
        validatePassword(password);
    }

    // Shows current password
    public String getPassword() {
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

    // Create Workspace
    public void createWorkSpace(String name) {
        Workspace newWorkspace = new SchoolWorkspace();
        workspaces.add(newWorkspace);
    }

    public static void main(String[] args) {
        User kyle = new User("lo7kyle@gmail.com", "123$%SebasKyle", "Kyle", "Lo", "blakeawk1234");
        System.out.println(kyle.getUserEmail());
        System.out.println(kyle.getPassword());
        System.out.println(kyle.getUserID());
        System.out.println(kyle.username);
        System.out.println(kyle.toString());
    }
}
