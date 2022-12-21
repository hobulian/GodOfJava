package JAVA8.added.lambda;

@FunctionalInterface // Functional Interface를 명시적으로 선언하여 개발 혼선을 줄임
interface Calculate { // Functional Interface : 기능적 인터페이스, 하나의 메소드만 선언되어 있는 것. 람다 표현식의 조건
    int operation(int a, int b);
}

public class calculator {
    public static void main(String[] args) {
        calculator calculator = new calculator();
        System.out.println("클래식한 가산기");
        System.out.println("=============");
        calculator.calculateClassic();
        System.out.println("람다 계산기");
        System.out.println("=============");
        calculator.calculateLambda();
    }

    private void calculateClassic() {
        Calculate calculateAdd = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculateAdd.operation(1,2));
    }

    private void calculateLambda() {
        Calculate calculateAdd = (a,b) -> a+b;
        System.out.println("람다 가산기");
        System.out.println(calculateAdd.operation(5,2));
        Calculate calculateSubtract = (a,b) -> a-b;
        System.out.println("람다 누산기");
        System.out.println(calculateSubtract.operation(5,2));
    }

}
