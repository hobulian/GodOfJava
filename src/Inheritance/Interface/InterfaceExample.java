package Inheritance.Interface;

public class InterfaceExample {
    public static void main(String[] args) {
        // MemberManager member = new MemberManager();
        // 이 경우 구현되지 않은 것으로 초기화하려 하냐는 오류가 발생한다.
        // 따라서 MemberManager을 Implements한 클래스로 초기화해줘야 한다.
        MemberManager member = new MemberManagerImpl();
    }
}
