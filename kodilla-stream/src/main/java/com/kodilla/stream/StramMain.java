package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.stream.Stream;

public class StramMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Stream<ForumUser> theResult = forum.getTheForumUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().plusYears(20).isBefore(LocalDate.now()))
                .filter(forumUser -> forumUser.getPublicedPosts() >= 1);

        System.out.println(theResult);





    }
}
