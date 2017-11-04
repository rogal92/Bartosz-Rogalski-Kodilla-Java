package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1357, "Deadpool", 'M',1992,10,31,22));
        theForumUserList.add(new ForumUser(1457, "John Locke", 'M',1990,12,4,2));
        theForumUserList.add(new ForumUser(1367, "Bruce Wayne", 'M',1986,4,12,12));
        theForumUserList.add(new ForumUser(2357, "Kate", 'F',1985,5,24,23));
        theForumUserList.add(new ForumUser(1350, "WW", 'F',1996,6,10,35));
    }

    public List<ForumUser> getTheForumUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
