package NestedClass.Inner;

/* Inner Class
    왜,언제 사용하는가?
    캡슐화. 하나의 클래스에서 공통적 작업을 수행하는 클래스가 클래스 외부에서는 전혀 사용되지 않을 때
    주로 GUI 관련 프로그램 개발에 사용. 특히 Listener(Event 발생 시에 수행해야만 하는 작업을 정의하는 역할)
    같은 Event(예시. 키 입력)일지라도 수행해야하는 작업은 애플리케이션마다 상이하기 때문.
 */
public class OuterOfInner {
    class Inner { // Static Nested Class와 차이는 선언 시에 Static이 아니라는 점
        private int value = 0;
        public int getValue() {
            return value;
        };
        public void setValue(int value) {
            this.value = value;
        }
    }
}
