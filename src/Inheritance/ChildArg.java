package Inheritance;

public class ChildArg extends ParentArg {
    public ChildArg() {
        /*
        실행 시에 ParentArg()라는 기본 생성자를 찾는데, 부모 클래스에 정의된 생성자는 String을 매개 변수로 받는 생성자 뿐이다.
        매개 변수가 있는 생성자를 만들었기 때문에, 기본 생성자가 자동으로 만들어지지 않았다.
        해결 방법으로는
            1. 부모 클래스에 매개 변수 없는 기본 생성자 작성
            2. 자식 클래스에 super()을 사용하는 방법. 명시적으로 지정하지 않았다면 자동으로 super()이 컴파일 때 추가. 꼭 첫줄에 선언하자.
         */
        super("childArg"); // 2.의 경우인데, 이 경우 부모 클래스에서 String을 매개 변수로 받을 수 있는 생성자에 넘겨준다.

        //super(null);
        /*
        reference to ParentArg is ambiguous 오류 메시지. 부모 클래스에 null을 매개변수로 넘겨받을 수 있는 메소드가 2개 이상이라 발생.
        */

        System.out.println("Child Constructor");
    }
}
