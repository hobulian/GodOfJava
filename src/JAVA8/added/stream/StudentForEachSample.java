package JAVA8.added.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String args[]){
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("찐빵", 32, 81, 75));
        sample.printStudentNames(studentList);
    }
    public void printStudentNames(List<StudentDTO> students) {
        //students.stream().forEach(student -> System.out.println(student.getName()));
        //students.stream().map(student -> student.getName()).forEach(name -> System.out.println(name));
        //students.stream().map(student -> student.getName()).forEach(x -> System.out.println(x));
        students.stream().map(student -> student.getName()).forEach(System.out::println);

    }
}
