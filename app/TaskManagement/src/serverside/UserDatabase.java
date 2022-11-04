package serverside;
import java.util.HashMap;
import java.util.Objects;


public class UserDatabase {
    private static int instantiationCounter = 0;    //we use this class variable to count how many times this object was instantiated
    private static HashMap<String, User> existingUsers = new HashMap<>();
    private static String count = "0000";
    private static int counter=0;
    private static volatile UserDatabase instance;
    
    private UserDatabase(){
        instantiationCounter++;
        // Default Constrcutor
    }
    public static UserDatabase getInstance(){
        if (instance == null) {
           instance = new UserDatabase();
        }
        return instance;
    }
    public static int getInstantiationCounter(){
        return instantiationCounter;
    }
    // creates a 4 digit counter
    private static void countUp() {
        if (9999 < counter) {
            return;
        }
        counter ++;
        count = String.format("%04d", counter);
    }
    // Generate User ID
    public static String generateUniqueID(String firstname, String lastname){
        // Get Initials. Deciding to use "" method because Name should be constant however I understand we can use StringBuilder().append()
        char firstChar = firstname.charAt(0);
        char secondChar = lastname.charAt(0);
        String initials = firstChar+""+secondChar;
        countUp();
        String userID = initials+"-"+count;
        return userID;


        }

    // method to save user to our database
    public static void saveUser(String username, User user){
        existingUsers.put(username, user);

    }

    // method to delete user from our database
    public static void deleteUser(String UserID){
        existingUsers.remove(UserID);
    }

    // Method to check if user exists
    public static boolean checkUserExist(String userId){
        boolean userExist;
        try{
            // if userId is in hashmap, return true
            if (existingUsers.containsKey(userId)){
                userExist = true;
                return userExist;
            }else{
                // else false
                userExist = false;
                return userExist;
            }
        }catch(NullPointerException e){
            return false;
        }
    }

    // Method to retrive the user and returns the user info
    public static User searchUser(String username){
        return existingUsers.get(username);
    }

    // Method to check password
    public static boolean checkPassword(User user, String passwordField){
        if(!Objects.equals(user.getPassword(), passwordField)){
            return false;
        }else{
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
