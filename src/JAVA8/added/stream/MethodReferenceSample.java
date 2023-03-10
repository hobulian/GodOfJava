package JAVA8.added.stream;

import java.util.Arrays;
import java.util.stream.Stream;

interface MakeString {
    String fromBytes(char[] chars);
}

public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"요다", "만두", "건빵"};
        System.out.println("Static Reference");
        System.out.println("================");
        sample.staticReference(stringArray);
        System.out.println();
        System.out.println("Object Reference");
        System.out.println("================");
        sample.objectReference(stringArray);
        System.out.println("Constructor Reference");
        System.out.println("================");
        sample.createInstance();
    }

    private static void printResult(String value) {
        System.out.println(value);
    }

    private void objectReference(String[] stringArray) {
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.asList(stringArray).stream().forEach(System.out::println);
    }

    private void staticReference(String[] stringArray) {
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }

    private void createInstance() {
        MakeString makestring = String::new;
        char[] chars = {'G', 'o', 'o', 'd', 'F', 'i', 'v', 'E'};
        String madeString = makestring.fromBytes(chars);
        System.out.println(madeString);
    }
}

