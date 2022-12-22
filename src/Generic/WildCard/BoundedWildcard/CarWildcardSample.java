package Generic.WildCard.BoundedWildcard;

import Generic.WildCard.WildcardGeneric;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBoundedWildcardMethod();
    }

//    public void callBoundedWildcardMethod() {
//        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
//        wildcard.setWildcard(new Car("Mustang"));
//        boundedWildcardMethod(wildcard);
//    }

    public void callBoundedWildcardMethod() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildcard(new Bus("6900"));
        boundedWildcardMethod(wildcard);
    }
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c) { // Car나 Car를 상속한 타입만 매개변수에 지정 가능
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
