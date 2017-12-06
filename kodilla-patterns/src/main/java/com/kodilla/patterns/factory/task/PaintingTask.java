package com.kodilla.patterns.factory.task;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPoint;

    public PaintingTask(String taskName, String color, String whatToPoint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPoint = whatToPoint;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPoint() {
        return whatToPoint;
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
