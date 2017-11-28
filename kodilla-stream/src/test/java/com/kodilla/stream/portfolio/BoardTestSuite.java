package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BoardTestSuite {
    public Board prepareTestData(){

        //users
        User userOne = new User("developer1", "John Smith");
        User userTwo = new User("projectmanager1","Nina White");
        User userThree = new User("developer2","Emilia Stephans");
        User userFour = new User("developer3", "Konrad Bridge");

        //tasks
        Task taskOne = new Task("tekst","the temperature from external service",
                userOne,
                userTwo,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));

        Task taskTwo = new Task("HQLs for anlysis","Prepare some HQL queries for anlysis",
                userOne,
                userTwo,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));


        Task taskThree = new Task("Temperatures entity", "Prepare entity for temperatures",
                userThree,
                userFour,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));

        Task taskFour = new Task("Own logger",
                "Refactor company logger to meet our needs",
                userThree,
                userTwo,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task taskFive = new Task("Optimize searching",
                "Archive data searching has to be optimized...",
                userFour,
                userTwo,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task taskSix = new Task("Use Streams",
                "use Streams rather than for-loops in predi...",
                userFour,
                userTwo,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskLists

        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(taskOne);
        taskListToDo.addTask(taskThree);

        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(taskFive);
        taskListInProgress.addTask(taskFour);
        taskListInProgress.addTask(taskTwo);

        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(taskSix);

        //board
        Board project = new Board("Project Weather Predictiction");

        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

        return project;

    }
    @Test
    public void testAddTaskList(){

        //Given
        Board project = prepareTestData();

        //When

        //Then
        Assert.assertEquals(3,project.getTaskLists().size());
    }
    @Test
    public void testAddTaskListFindUsersTasks(){

        //Given
         Board project = prepareTestData();

         //When
         User user = new User("developer1", "John Smith");
         List<Task> tasks = project.getTaskLists().stream()
         .flatMap(l -> l.getTasks().stream())
         .filter(t -> t.getAssignedUser().equals(user))
         .collect(toList());

         //Then
         Assert.assertEquals(2, tasks.size());
         Assert.assertEquals(user, tasks.get(0).getAssignedUser());
         Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }
    @Test
    public void testAddTaskListFindOutdatedTasks(){
        //given
        Board project = prepareTestData();

        //when
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));

        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tL -> tL.getTasks().stream()
                .filter(t -> t.getDeadLine().isBefore(LocalDate.now()))
                .collect(toList()));

        //then
        Assert.assertEquals(1,tasks.size());
        Assert.assertEquals("HQLs to analysis", tasks.get(0).getTitle());
    }
    @Test
    public void testAddTaskListFindLongTasks(){
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream()
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)))
                .count());

        //Then
        Assert.assertEquals(2,longTasks);
    }
    @Test
    public void testAddTaskListAverageWorkingOnTask(){
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasksTime = new ArrayList<>();
        inProgressTasksTime.add(new TaskList("In progress"));
        Double average = IntStream.range(0,inProgressTasksTime.size()).mapToDouble(value -> value).average().getAsDouble();


//                project.getTaskLists().stream()
//                .filter(inProgressTasksTime::contains)
//                .flatMap(tll -> tll.getTasks().stream())
//                .map(task -> task.getCreated())
//                .count();
//        public interface ArrayOperations {
//            static Double getAverage(final int[] numbers){
//
//                IntStream.range(0, numbers.length).forEach(v -> System.out.println(numbers[v]) );
//                double result =  IntStream.range(0, numbers.length).map(v -> numbers[v]).average().getAsDouble();
//                return result;
//            }
//        }
//
//        //Then
//        Assert.assertEquals(9,);
    }
}
