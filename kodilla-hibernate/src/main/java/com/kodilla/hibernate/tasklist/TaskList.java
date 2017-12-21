package com.kodilla.hibernate.tasklist;


import com.kodilla.hibernate.task.Task;
import com.sun.istack.internal.NotNull;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TaskList")
public class TaskList {
    private int id;
    private String listName;
    private String description;
    private List<Task> tasks = new ArrayList<>();

    public TaskList() {
    }

    public TaskList(int id, String listName, String description) {
        this.id = id;
        this.listName = listName;
        this.description = description;
    }

    public TaskList(String listname, String toDo_tasks) {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)

    public int getId() {
        return id;
    }

    @Column(name = "ListName")
    public String getListName() {
        return listName;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    @OneToMany(
            targetEntity = Task.class,
            mappedBy = "taskList",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Task> getTasks() {
        return tasks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
