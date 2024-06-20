package com.green.DataPractice.vo;

import java.util.Arrays;

//2024.6.20 2교시
public class ScoreVO {
    private String name;
    //ㄴ변수명과 html의 name 속성값(이름)이 일치해야 함
    private int year;
    private String[] tel;
    private String gender;
    private int korScore;
    private int engScore;
    private int mathScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getTel() {
        return tel;
    }

    public void setTel(String[] tel) {
        this.tel = tel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "ScoreVO{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", tel=" + Arrays.toString(tel) +
                ", gender='" + gender + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", mathScore=" + mathScore +
                '}';
    }
}


