package NestedClass.Inner;

public class InnerSample {
    public static void main(String[] args) {
        InnerSample sample = new InnerSample();
        sample.makeInnerObject();
    }

    public void makeInnerObject() {
        OuterOfInner outer = new OuterOfInner();
        OuterOfInner.Inner inner = outer.new Inner();
        // Inner Class의 생성자 만드는 방법. Static과 다르게 먼저 Outer Class를 생성해야한다.
        inner.setValue(3);
        System.out.println(inner.getValue());
    }
}
