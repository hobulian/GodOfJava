package Inheritance.Interface;

/* Defualt Method
    하위 호환성을 위해 제작된 메소드
    해당 인터페이스를 상속받는 구현체들은 디폴트 메소드의 구현도 상속받을 수 있음
    다중 상속 기능도 구현할 수 있음 이 경우에 규칙이 있는데
    1. 클래스가 항상 우선함. 클래스나 슈퍼 클래스에서 정의한 메소드가 디폴트 메소드보다 우선
    2. 서브 인터페이스가 우선함. 상속 관계를 갖는 인터페이스에서 같은 시그니처를 갖는 메소드가 정의될 때는 서브 인터페이스가 우선됨.
    3. 1,2로도 결정되지 않는다면, 상속받는 클래스 안에서 디폴트 메소드를 오버라이드하여 재호출 해야한다.
 */
public interface DefaultStaticInferface {
    static final String name="자바의 신";
    static final int since = 2013;
    String getName();
    int getSince();
    default String getEmail(){
        return name+ "@godofjava.com";
    }
}
