package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate birthDate;
    private final int publicedPosts;

    public ForumUser(int id, String userName, char gender,int year,int month,int day, int publicedPosts) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = LocalDate.of(year, month, day);
        this.publicedPosts = publicedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublicedPosts() {
        return publicedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", publicedPosts=" + publicedPosts +
                '}';
    }
}
