package jswing.model;

import jswing.event.EventTaskTableActions;

import jswing.TaskProfile;

public class ModelTask {
    private String taskID;
    private String taskName;
    private String description;
    private String startDate;
    private String endDate;
    private String priority;
    private String status;
    private String estimatedHours;
    private String assignee;
    private String notes;
    private String actualHours;

    public ModelTask(String taskid, String taskName, String description, String startDate, String endDate,
            String priority, String status, String notes, String assignee) {
        this.taskID = taskid;
        this.taskName = taskName;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.startDate = startDate;
        this.startDate = endDate;
        this.assignee = assignee;
        this.estimatedHours = estimatedHours;
        this.notes = notes;
        this.actualHours = actualHours;
    }

    public String getTaskID() {
        return taskID;
    }

    public ModelTask() {
    }

    public Object[] toRowTable(EventTaskTableActions event) {
        return new Object[] { taskID, taskName, description, startDate, endDate, priority, status,
                notes, assignee, new ModelTaskTableAction(this, event) };
    }
}
