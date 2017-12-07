package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task doTask(final String taskClass) {
        switch(taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Make an eight","Near Driving School","Honda Africa Twin");
            case PAINTINGTASK:
                return new PaintingTask("Test your skills","Black&White","Mona Lisa");
            case SHOPPINGTASK:
                return new ShoppingTask("Spend 1 Million in 1 day","Only usefull thinks",1000000.0);
            default:
                return null;

        }
    }
}
