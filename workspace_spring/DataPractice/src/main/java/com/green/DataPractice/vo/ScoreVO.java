package com.green.DataPractice.vo;

public class ScoreVO {
    private String name;
    private String grade;
    private String tel;
    private int KorScore;
    private int EngScore;
    private int MathScore;
    private int avg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getKorScore() {
        return KorScore;
    }

    public void setKorScore(int korScore) {
        KorScore = korScore;
    }

    public int getEngScore() {
        return EngScore;
    }

    public void setEngScore(int engScore) {
        EngScore = engScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "ScoreVO{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", tel='" + tel + '\'' +
                ", KorScore=" + KorScore +
                ", EngScore=" + EngScore +
                ", MathScore=" + MathScore +
                ", avg=" + avg +
                '}';
    }
}
