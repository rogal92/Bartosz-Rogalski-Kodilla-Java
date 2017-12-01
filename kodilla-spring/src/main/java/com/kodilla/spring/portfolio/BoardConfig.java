package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("TaskLists")
    TaskList taskList;

    @Bean(name = "TaskLists")
    public Board getBoard() {
        return new Board(taskList, taskList, taskList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "inProgressList")
    @Scope("Prototype")
    public TaskList getInProgressList() {
        return new TaskList(new ArrayList<>());
    }

    @Bean(name = "doneList")
    @Scope("Prototype")
    public TaskList getDoneList() {
        return new TaskList(new ArrayList<>());
    }
}


