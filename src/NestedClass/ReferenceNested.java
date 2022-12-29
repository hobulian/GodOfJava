package NestedClass;

public class ReferenceNested {
    static class StaticNested{
        private int staticNestedInt = 99;
    }
    class Inner {
        private int innerValue = 100;
    }
    public void setValue(int value) {
        StaticNested nested = new StaticNested();
        nested.staticNestedInt = value;
        Inner inner = new Inner();
        inner.innerValue = value;
    }
    // 외부 클래스는 내부 클래스의 값들이 private라고 하여도 모두 접근 가능하다.
}
