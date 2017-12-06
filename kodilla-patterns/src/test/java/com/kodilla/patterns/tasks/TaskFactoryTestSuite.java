package com.kodilla.patterns.tasks;

import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals(false,drivingTask.isTaskExecuted());
        Assert.assertEquals("Make an eight",drivingTask.getTaskName());
        Assert.assertEquals(true,drivingTask.executeTask());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
        Assert.assertEquals("Test your skills", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.executeTask());
    }
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Spend 1 Million in 1 day", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.executeTask());
    }
}