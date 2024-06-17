package collection.list.test;
//2024.6.17 1교시

public class Test_Student {
    private String name;
    private int scoreKor;
    private int scoreEng;
    private int score;

    public Test_Student(String name, int scoreKor, int scoreEng, int score) {
        this.name = name;
        this.scoreKor = scoreKor;
        this.scoreEng = scoreEng;
        this.score = scoreKor + scoreEng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScoreKor() {
        return scoreKor;
    }

    public void setScoreKor(int scoreKor) {
        this.scoreKor = scoreKor;
    }

    public int getScoreEng() {
        return scoreEng;
    }

    public void setScoreEng(int scoreEng) {
        this.scoreEng = scoreEng;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Test_Student{" +
                "name='" + name + '\'' +
                ", scoreKor=" + scoreKor +
                ", scoreEng=" + scoreEng +
                ", score=" + score +
                '}';
    }
}
