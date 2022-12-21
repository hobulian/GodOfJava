package JAVA8.added.lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        PredicateExample sample = new PredicateExample();

        Predicate<String> predicateLength5=(a) -> a.length()>5;
        Predicate<String> predicateContains=(a) -> a.contains("God");
        Predicate<String> predicateStart=(a) -> a.startsWith("God");

        String godOfJava = "GodOfJava";
        String goodJava = "GoodJava";

        sample.predicateTest(predicateLength5, godOfJava);
        sample.predicateTest(predicateLength5, goodJava);

        sample.predicateNegate(predicateLength5, godOfJava);
        sample.predicateNegate(predicateLength5, goodJava);

        sample.predicateAnd(predicateLength5, predicateContains, godOfJava);
        sample.predicateAnd(predicateLength5, predicateContains, goodJava);

        sample.predicateOr(predicateLength5, predicateStart, godOfJava);
        sample.predicateOr(predicateLength5, predicateStart, goodJava);
    }

    private void predicateTest(Predicate<String> p, String data) { // 데이터가 해당 조건에 맞는지를 확인
        System.out.println(p.test(data));
    }
    private void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) { // 데이터가 두개의 조건에 모두 맞는지 확인
        System.out.println(p1.and(p2).test(data));
    }
    private void predicateOr(Predicate<String> p1, Predicate<String> p2, String data) { // 데이터가 두개의 조건 중 하나라도 맞는지 확인
        System.out.println(p1.or(p2).test(data));
    }
    private void predicateNegate(Predicate<String> p, String data) { // 데이터가 조건과 다른지 확인
        System.out.println(p.test(data));
    }
}
