package JAVA8.added.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        StreamMap streamMap = new StreamMap();
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        streamMap.multiplyWithFor(intList);

        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 39, 29, 10));
        studentList.add(new StudentDTO("찐빵", 19, 59, 100));
        studentList.add(new StudentDTO("만두", 29, 99, 50));

        List<String> nameList = studentList.stream().map(x->x.getName()).collect(Collectors.toList());
        System.out.println(nameList);
    }

    public void multiplyWithFor(List<Integer> intList) {
//        for (int value : intList) {
//            int temp = value * 3;
//            System.out.println(temp);
//        }
        intList.stream().map(x->x*3).forEach(System.out::println);
    }
}
