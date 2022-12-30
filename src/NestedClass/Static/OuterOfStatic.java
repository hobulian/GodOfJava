package NestedClass.Static;

/** Nested Class
    왜 사용하는가?
    1. 한 곳에섬나 사용되는 클래스를 논리적으로 묶어서 처리해야 할 때 > Static nested class
    2. 캡슐화. 내부 구현을 감추고 싶을 때 > Inner class
    3. 소스의 가독성과 유지 보수성 증대
 */

public class OuterOfStatic {
    static class StaticNested { // 컴파일 시에 OutOfStatic$StaticNested.class가 만들어짐
        private int value = 0;
        public int getValue() {
            return value;
        };
        public void setValue(int value) {
            this.value = value;
        }
    }
}

/** Static Nested Class
    왜 만드는가?

    public class University {
        static class Student { }
    }

    public class School {
        static class Student { }
    }

    위의 예시와 같이 겉으로 보기에 유사하지만 내부 구현이 달라야 할 때 사용된다
 */
