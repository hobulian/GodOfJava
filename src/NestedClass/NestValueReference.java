package NestedClass;

import NestedClass.Inner.Anonymous.EventListener;

public class NestValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    // 예약어로 변수명을 설정할 수는 없다. 따라서 protectedInt처럼 써야함
    int justInt = 2;
    private int privateInt = 3;
    static int staticInt = 4;
    static class StaticNested { // Static Nested Class는 외부 클래스의 Static 변수만을 참조할 수 있다.
        public void setValue() {
            staticInt = 14;
        }
    }
    class Inner {
        public void setValue() {
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }
    public void setValue() {
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
    }
}
