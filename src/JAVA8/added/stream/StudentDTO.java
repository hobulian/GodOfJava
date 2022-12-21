package JAVA8.added.stream;

import org.w3c.dom.ls.LSOutput;

public class StudentDTO {
    String name;
    int age;
    int scoreMath;
    int scoreEnglish;

    public StudentDTO(String name, int age, int scoreMath, int scoreEnglish) {
        this.name = name;
        this.age = age;
        this.scoreMath = scoreMath;
        this.scoreEnglish = scoreEnglish;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScoreMath() {
        return scoreMath;
    }

    public int getScoreEnglish() {
        return scoreEnglish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScoreMath(int scoreMath) {
        this.scoreMath = scoreMath;
    }

    public void setScoreEnglish(int scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }

}