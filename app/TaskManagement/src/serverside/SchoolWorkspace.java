package serverside;

public class SchoolWorkspace extends Workspace{
    private String semesterGrade;
    private String semesterGPA;
    Container classes;

    //School workspace is what we are working on.
    SchoolWorkspace(String name){
        super(name);
    }
}
