package com.kodilla.patterns2.observer.homework;

public class CourseUser implements Observer {
    private final String username;
    private int updateCount;

    public CourseUser(String username) {
        this.username = username;
    }

    @Override
    public void update(CourseTask courseTask) {
        System.out.println(username + ": New messages in task " +  courseTask.getName() + courseTask.getMessages() + "\n" + "(total: " +
        courseTask.getMessages().size() + " messages");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}