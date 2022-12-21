package JAVA8.added.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();

        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 39, 29, 10));
        studentList.add(new StudentDTO("찐빵", 19, 59, 100));
        studentList.add(new StudentDTO("만두", 29, 99, 50));

        System.out.println("영어 점수 80점 이상의 학생");
        sample.filterWithScoreForLoop(studentList, 80);
    }

    private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
//        for (StudentDTO student : studentList) {
//            if (student.getScoreEnglish() > scoreCutLine) {
//                System.out.println(student.getName());
//            }
//        }
        studentList.stream().filter(student -> student.getScoreEnglish() >= scoreCutLine).forEach(student -> System.out.println(student.getName()));
    }
}
