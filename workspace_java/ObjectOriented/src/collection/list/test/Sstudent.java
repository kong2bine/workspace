package collection.list.test;
//2024.6.17 4교시

public class Sstudent {
    String name;
    String age;
    int score;

    public Sstudent(String name, String age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sstudent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", score=" + score +
                '}';
    }
}

