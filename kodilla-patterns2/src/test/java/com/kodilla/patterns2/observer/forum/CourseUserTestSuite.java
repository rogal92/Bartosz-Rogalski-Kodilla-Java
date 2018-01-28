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




//    @Test
//    public void estUpdate() {
//        //Given
//        ForumTopic javaHelpForum = new JavaHelpForumTopic();
//        ForumTopic javaToolsForum = new JavaToolsForumTopic();
//        ForumUser johnSmith = new ForumUser("John Smith");
//        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
//        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
//        javaHelpForum.registerObserver(johnSmith);
//        javaToolsForum.registerObserver(ivoneEscobar);
//        javaHelpForum.registerObserver(jessiePinkman);
//        javaToolsForum.registerObserver(jessiePinkman);
//
//        //When
//        javaHelpForum.addPost("Hi everyone! Could you help me with for loop");
//        javaHelpForum.addPost("Better try to use hile loop in this case");
//        javaToolsForum.addPost("Help pls,my MySQL db doesn't want to work");
//        javaHelpForum.addPost("Why while ? Is it better?");
//        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.") ;
//
//        //Then
//        assertEquals(3,johnSmith.getUpdateCount());
//        assertEquals(2, ivoneEscobar.getUpdateCount());
//        assertEquals(5, jessiePinkman.getUpdateCount());
//    }
//}
