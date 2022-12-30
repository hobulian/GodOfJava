package Inheritance.Overriding;

/** 동적 바인딩
    메소드의 body가 런타임에 메소드 call과 묶일 경우 그 것을 동적 바인딩 혹은 late binding이라 함
    Overriding은 동적 바인딩을 설명하는 좋은 예시

    규칙
    0. 상속 관계에 있어야 함
    1. 상속 받은 클래스간 Overriding을 하려면 메소드 이름이 같아야 함
    2. 메소드의 파라미터 또한 같아야 함(1/2를 합쳐서 동일한 시그니쳐 라고 말함)
    3. 부모 클래스의 접근 제어자보다 축소된 권한으로 제작할 수 없다.

    제한
    1. 부모 클래스의 private 메소드는 오버라이드 할 수 없다
    2. Final 메소드도 마찬가지
    3. Static 메소드도 마찬가지
 */
class India {
    public void locate() {
        System.out.println("We are in India");
    }
}

class SubIndia extends India {

    @Override
    public void locate() {
        System.out.println("We are in Delhi");
    }
}
public class Location {
    public static void main(String[] args) {
        India superObj = new India();
        superObj.locate();
        India subObj = new SubIndia();
        subObj.locate();
        SubIndia subObj2 = new SubIndia();
        subObj2.locate();
    }
}
