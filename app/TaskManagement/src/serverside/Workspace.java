package serverside;

import java.sql.Timestamp;
import java.util.List;

public abstract class Workspace implements Subject {
    /*
     * A workspace is an object that contains your containers/tasks. A user can have
     * mutliple workspaces.
     * ex: User1 is a student but also works part time at a company. User1 can have
     * a SJSU Workspace and a UnicornInc Workspace
     * Each workspace will contain its own containers and tasks relating to its own
     * workspace.
     */
    private List<Observer> observers;
    List<ServerContainer> containers;
    String workspaceName;
    Timestamp creationDate;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyAllObservers(ServerContainer container) {
        for (Observer observer : observers) {
            observer.updateContainer(containers, container);
        }

    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public void addContainertoWorkspace(ServerContainer container) {
        containers.add(container);
        notifyAllObservers(container);
    }

    public void removeContainerfromWorkspace(ServerContainer container) {
        containers.remove(container);
        notifyAllObservers(container);
    }

    public abstract ServerContainer createAcademicContainer();

    public abstract ServerContainer createProjectContainer();

    // Main method for debugging purposes only
    public static void main(String[] args) {
        User kyle = new User("lo7kyle@gmail.com", "123$%SebasKyle", "Kyle", "Lo", "blakeawk1234");
        System.out.println(kyle.getUserEmail());

    }

}
