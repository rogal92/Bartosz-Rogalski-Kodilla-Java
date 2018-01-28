package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Queue;

public class CourseTask implements Observable {

    private final Queue<Observer> observers;
    private final Queue<String> messages;
    private final String name;

    public CourseTask(String name) {
        observers = new ArrayDeque<>();
        messages = new ArrayDeque<>();
        this.name = name;
    }

    public void addComment(String comment) {
        messages.offer(comment);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.offer(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Queue<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}