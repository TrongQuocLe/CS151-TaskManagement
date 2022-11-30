package serverside;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class ServerContainer {
    String containerName;
    List<Task> taskList;
    HashMap<String, Compartment> compartments;
    List<String> tags;

    protected ServerContainer() {
    }

    protected ServerContainer(String name) {
        this.containerName = name;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public void addCompartment(String compartmentName) {
        Compartment compartment;
        compartment = createCompartment(compartmentName);
        if (compartments == null) {
            compartments = new HashMap<String, Compartment>();
        }
        this.compartments.put(compartmentName, compartment);
    }

    public void addTask(String taskName) {
        Task task;
        if (taskList == null) {
            taskList = new ArrayList<Task>();
        }
        task = createTask();
        this.taskList.add(task);
    }

    public String getTasks() {
        return this.taskList.toString();
    }

    public String getTags() {
        return this.tags.toString();
    }

    protected abstract Compartment createCompartment(String compartmentName);

    protected abstract Task createTask();

}
