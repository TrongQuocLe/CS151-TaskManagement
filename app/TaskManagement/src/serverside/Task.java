package serverside;

import java.util.Date;

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

    public Task (){}

    public Task(String name) {
        this.taskName = name;
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

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
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

    public Priority getPriority() {
        return this.priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static void main(String[] args) {
        Task newTask = new Task("Create Task Class");
        System.out.println(newTask.getTaskName());
    }
}
