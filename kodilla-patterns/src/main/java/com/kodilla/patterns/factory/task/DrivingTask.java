package com.kodilla.patterns.factory.task;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public String executeTask() {
        return null;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
