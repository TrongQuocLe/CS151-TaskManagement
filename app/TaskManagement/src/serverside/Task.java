package serverside;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Task {
    private String taskName;
    private String description;
    private String notes;
    private String assignee;
    private int duration;
    private int estimatedHours;
    private int actualHours;
    private Date startDate;
    private Date endDate;
    private Task dependencies;
    private Priority priority;
    private Status status;

    enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    enum Status {
        NOTYETSTARTED,
        ONHOLD,
        INPROGRESS,
        COMPLETE
    }

    public Task() {
    }

    public Task(String name, String description, String status, String priority, String startDate, String endDate,
            String assignee, String estimatedHours) {
        this.taskName = name;
        this.description = description;
        setStatus(status);
        setPriority(priority);
        setDates(startDate, endDate);
        setOptional(assignee, estimatedHours);

    }

    public void setDates(String startDate, String endDate) {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.startDate = formatter1.parse(startDate);
            this.endDate = formatter1.parse(endDate);
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public void setOptional(String assignee, String estimatedHours) {
        this.assignee = assignee;
        if (!estimatedHours.isEmpty()) {
            this.estimatedHours = Integer.parseInt(estimatedHours);
        }
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getAssignee() {
        return this.assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getEstimatedHours() {
        return this.estimatedHours;
    }

    public void setEstimatedHours(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public int getActualHours() {
        return this.actualHours;
    }

    public void setActualHours(int actualHours) {
        this.actualHours = actualHours;
    }

    public String getStartDate() {
        return getStringDate(this.startDate);
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return getStringDate(this.endDate);
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Task getDependencies() {
        return this.dependencies;
    }

    public void setDependencies(Task dependencies) {
        this.dependencies = dependencies;
    }

    public String getPriority() {
        return this.priority.name();
    }

    public void setPriority(String priority) {
        this.priority = Priority.valueOf(priority.toUpperCase());
    }

    public String getStatus() {
        return this.status.name();
    }

    public void setStatus(String status) {
        status = status.replaceAll(" ", "");
        this.status = Status.valueOf(status.toUpperCase());
    }

    public String getStringDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(date);
        return strDate;
    }

    public static void main(String[] args) throws Exception {
        Task newTask = new Task();
        System.out.println(newTask.getTaskName());
        String test1 = "I like bananas";
        System.out.println(test1.replaceAll(" ", ""));
        String sdate = "31-12-1998";
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
        Date ddate = formatter1.parse(sdate);
        System.out.println(ddate);
    }
}