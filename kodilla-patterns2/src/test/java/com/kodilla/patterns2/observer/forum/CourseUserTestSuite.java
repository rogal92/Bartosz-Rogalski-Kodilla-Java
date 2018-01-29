package com.kodilla.patterns2.observer.forum;

import com.kodilla.patterns2.observer.homework.CourseTask;
import com.kodilla.patterns2.observer.homework.CourseUser;
import com.kodilla.patterns2.observer.homework.DecoratorCourseTask;
import com.kodilla.patterns2.observer.homework.ObaserverCourseTask;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        CourseTask decoratorCourseTask = new DecoratorCourseTask();
        CourseTask observerCourseTask = new ObaserverCourseTask();
        CourseUser barrySeals = new CourseUser("Barry Seals");
        CourseUser sonGoku = new CourseUser("Son Goku");
        decoratorCourseTask.registerObserver(barrySeals);
        observerCourseTask.registerObserver(sonGoku);
        observerCourseTask.registerObserver(barrySeals);


        //When
        decoratorCourseTask.addComment("Decorator test");
        decoratorCourseTask.addComment("Decorator test 2");
        observerCourseTask.addComment("Observer test");
        observerCourseTask.addComment("Observer test 2");

        //Then
        assertEquals(2,sonGoku.getUpdateCount());
        assertEquals(4,barrySeals.getUpdateCount());
    }
}
