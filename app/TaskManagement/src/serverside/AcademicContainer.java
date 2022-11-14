package serverside;

import java.util.ArrayList;
import java.util.HashMap;

public class AcademicContainer extends Container {
    String grade;
    double gradePercentage;
    HashMap<String, Double> classWeightedBreakdown;

    public AcademicContainer() {
    }

    public void addWeightedBreakdown(String breakdown, Double weight) {
        if (classWeightedBreakdown == null) {
            classWeightedBreakdown = new HashMap<String, Double>();
            tags = new ArrayList<String>();
        }
        classWeightedBreakdown.put(breakdown, weight);
        tags.add(breakdown);
    }

    @Override
    protected Compartment createCompartment(String compartmentName) {
        Compartment compartment = new Compartment(containerName);
        return compartment;
    }

    @Override
    protected Task createTask(String taskName) {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        AcademicContainer acdecContainer = new AcademicContainer();
        acdecContainer.setContainerName("CS151-Object Oriented Design");
        acdecContainer.addWeightedBreakdown("Projects", 40.0);
        acdecContainer.addWeightedBreakdown("Homework", 10.0);
        acdecContainer.addWeightedBreakdown("Midterm", 20.0);
        acdecContainer.addWeightedBreakdown("Final", 30.0);
        acdecContainer.addCompartment("Projects");

        System.out.println(acdecContainer.containerName);
        System.out.println(acdecContainer.classWeightedBreakdown.toString());
        System.out.println(acdecContainer.tags.toString());
        System.out.println(acdecContainer.compartments.toString());

    }

}
