package Generic.WildCard;

public class WildcardSample {

    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }
    public void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        //WildcardGeneric<?> wildcard = new WildcardGeneric<String>(); // (2)에러. Wildcard로 객체 선언 시에 특정 타입으로 값 지정은 불가능함
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

//    public void wildcardStringMethod(WildcardGeneric<String> c) {
//        String value = c.getWildcard();
//        System.out.println(value);
//    }
    public void wildcardStringMethod(WildcardGeneric<?> c) { // 제네릭 타입이 미정일 때 ? 사용. ? = Wildcard 타입. (1)메소드의 매개변수로만 사용하는 것이 좋다.
        Object value = c.getWildcard(); // 제네릭 타입을 모르기 때문에 Object로 처리한 것
        if (value instanceof String) { // 넘어오는 타입이 정해져 있다면 instanceof로 처리 가능
            System.out.println(value);
        }
    }
}
