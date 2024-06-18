package com.green.Start;
//2024.6.18 7교시

public class Member {
    private String name;
    private int age;
    private int Score;

    public Member(String name, int age, int score) {
        this.name = name;
        this.age = age;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
