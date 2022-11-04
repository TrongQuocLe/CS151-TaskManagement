package serverside;
import java.util.Date;

abstract class Workspace {
    /*A workspace is an object that contains your containers/tasks. A user can have mutliple workspaces. 
     ex: User1 is a student but also works part time at a company. User1 can have a SJSU Workspace and a UnicornInc Workspace
     Each workspace will contain its own containers and tasks relating to its own workspace. 
    */
    String objectName = " ";
    Date creationDate;
    Workspace(String name){
        this.objectName = name;
        this.creationDate = new Date();
    }
    // Shared methods for extending class
    public void addContainertoWorkspace(){
        // method for adding containers to Workspace
    }
    public void removeContainerfromWorkspace(){
        // method for removing container from workspace
    }
    
    // Main method for debugging purposes only
    public static void main(String[] args) {
        User kyle = new User("lo7kyle@gmail.com", "123$%SebasKyle", "Kyle", "Lo", "blakeawk1234");
        System.out.println(kyle.getUserEmail());

    }
}
