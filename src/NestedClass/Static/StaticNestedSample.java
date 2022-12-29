package NestedClass.Static;

public class StaticNestedSample {
    public static void main(String[] args) {
        StaticNestedSample sample = new StaticNestedSample();
        sample.makeStaticNestedObject();
    }

    public void makeStaticNestedObject() {
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        // Static Nested Class의 생성자 만드는 방법
        staticNested.setValue(3);
        System.out.println(staticNested.getValue());
    }
}
