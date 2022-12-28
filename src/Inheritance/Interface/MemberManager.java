package Inheritance.Interface;

import Inheritance.MemberDTO;

/*  Interface
    설계시 선언해 두면 개발할 때 기능 구현에만 집중 가능
    개발자의 역량에 따른 메소드 이름과 매개 변수 선언의 격차를 줄일 수 있음
    공통적인 인터페이스와 abstract 클래스의 선언은 선언과 구현을 구분하게 해줌
    외부에 노출되는 것을 정의하고자 할 때 사용
    구현되거나 static or final인 메소드가 선언되어선 안된다.
    인터페이스도 상속이 가능하다. 다중 상속도 가능하다.
 */
public interface MemberManager {
    public boolean addMember(MemberDTO member);
    public boolean removeMember(String name, String phone);
    public boolean updateMember(MemberDTO member);
}
