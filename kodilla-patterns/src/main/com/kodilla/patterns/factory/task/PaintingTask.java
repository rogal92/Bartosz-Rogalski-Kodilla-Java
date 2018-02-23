package com.kodilla.patterns.factory.task;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPoint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPoint;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public Boolean executeTask() {
        return true;
    }

    @Override
    public Boolean isTaskExecuted() {
        return false;
    }
}
