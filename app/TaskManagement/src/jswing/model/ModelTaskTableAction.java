package jswing.model;

import jswing.event.EventTaskTableActions;

public class ModelTaskTableAction {

    public ModelTask getTask() {
        return task;
    }

    public void setTask(ModelTask task) {
        this.task = task;
    }

    public EventTaskTableActions getEvent() {
        return event;
    }

    public void setEvent(EventTaskTableActions event) {
        this.event = event;
    }

    public ModelTaskTableAction(ModelTask task, EventTaskTableActions event) {
        this.task = task;
        this.event = event;
    }

    public ModelTaskTableAction() {
    }

    private ModelTask task;
    private EventTaskTableActions event;
}