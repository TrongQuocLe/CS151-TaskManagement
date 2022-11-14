package serverside;

import java.util.HashMap;

public class Compartment extends ServerContainer {
    double score;
    double outOf;

    HashMap<String, Compartment> assignments;

    public Compartment(String compartmentName) {
        this.containerName = compartmentName;
    }

    public void setTotalPoints(double points) {
        this.outOf = points;
    }

    public void setScore(double points) {
        this.score = points;
    }

    public void calculateAssignmentTotalScore() {
        double total = 0.0;
        for (Compartment assignment : this.assignments.values()) {
            try {
                total += assignment.score;
            } catch (NullPointerException e) {
                System.out.println("You currently have no Scores on your assignments " + e);
            }
        }
    }

    public void calculateAssignmentTotalPoints() {
        double total = 0.0;
        for (Compartment assignment : this.assignments.values()) {
            try {
                total += assignment.outOf;
            } catch (NullPointerException e) {
                System.out.println("You currently have no Assignments " + e);
            }
        }
    }

    @Override
    protected Compartment createCompartment(String containerName) {
        Compartment compartment = new Compartment(containerName);
        return compartment;
    }

    @Override
    protected Task createTask(String taskName) {
        Task task = new Task(taskName);
        return task;
    }

    public static void main(String[] args) {
        Compartment testCompartment = new Compartment("Homework");
        testCompartment.addCompartment("Homework1");
        Compartment homework1 = testCompartment.compartments.get(0);
        homework1.addTask("Finish up Serverside Implementation");
        System.out.println(homework1.taskList.get(0).getTaskName());
    }

}
