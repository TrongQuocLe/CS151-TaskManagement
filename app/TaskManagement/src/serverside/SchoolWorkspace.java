package serverside;

import java.util.ArrayList;
import java.sql.Timestamp;

public class SchoolWorkspace extends Workspace {
    private String semesterGrade;
    private String semesterGPA;

    // School workspace is what we are working on.
    public SchoolWorkspace() {
        containers = new ArrayList<>();
        creationDate = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public AcademicContainer createAcademicContainer() {
        AcademicContainer course = new AcademicContainer();
        containers.add(course);
        return course;

    }

    @Override
    public ServerContainer createProjectContainer() {
        ProjectContainer course = new ProjectContainer();
        return course;
    }

    public static void main(String[] args) {
        // Create Workspace
        SchoolWorkspace schoolSpace = new SchoolWorkspace();
        schoolSpace.setWorkspaceName("SJSU Fall Semester");
        System.out.println(schoolSpace.workspaceName);

        // Create Container
        AcademicContainer cs151 = schoolSpace.createAcademicContainer();
        System.out.println(schoolSpace.creationDate);
        cs151.setContainerName("CS151-Object Oriented Design");
        cs151.addWeightedBreakdown("Assignments", 25.0);
        cs151.addWeightedBreakdown("Quizzes", 10.0);
        cs151.addWeightedBreakdown("Midterm", 20.0);
        cs151.addWeightedBreakdown("Project", 20.0);
        cs151.addWeightedBreakdown("Class Participation", 5.0);
        cs151.addWeightedBreakdown("Final Exam", 20.0);
        cs151.addCompartment("Homework");
        cs151.compartments.get("Homework").addCompartment("Homework1");
        cs151.compartments.get("Homework").compartments.get("Homework1").addTask("Finish up Serverside stuff");
        cs151.compartments.get("Homework").compartments.get("Homework1").setTotalPoints(100.0);
        cs151.compartments.get("Homework").compartments.get("Homework1").setScore(55.6);

        System.out.println(cs151.classWeightedBreakdown.toString());
        System.out.println(schoolSpace.containers);
        ServerContainer test = schoolSpace.containers.get(0);
        System.out.println(test.getTags());
        System.out.println(
                cs151.compartments.get("Homework").compartments.get("Homework1").taskList.get(0).getTaskName());

    }

}
