package com.green.DataPractice.vo;
//2024.6.19 5교시

import java.util.Arrays;

public class SurveyVO {
    private String intro;
    private String gender;
    private String[] hobby;
    //private List<String> hobby; 가능. 둘 중 편한거 쓰면 됑
    private String path;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "SurveyVO{" +
                "intro='" + intro + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", path='" + path + '\'' +
                '}';
    }
}