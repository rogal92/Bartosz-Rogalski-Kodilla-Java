package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.getTasks().add(0,"First task to do");
        board.inProgressList.getTasks().add(0,"First task in progress");
        board.doneList.getTasks().add(0,"First done task");
        //Then
        Assert.assertEquals(1,board.toDoList.getTasks().size());
        Assert.assertEquals(1,board.inProgressList.getTasks().size());
        Assert.assertEquals(1,board.doneList.getTasks().size());
    }
}
