package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StramMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResult = forum.getTheForumUserList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().plusYears(20).isBefore(LocalDate.now()))
                .filter(forumUser -> forumUser.getPublicisedPosts() >= 1)
                .collect(Collectors.toMap(forumUser -> forumUser.getId(), user -> user));

        System.out.println(theResult);
    }
}
