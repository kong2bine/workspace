package collection.test;
//2024.6

public class Test_Student {
    String name;
    int scoreKor;
    int scoreEng;
    int score;

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
