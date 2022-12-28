package Inheritance.Abstract;

import Inheritance.MemberDTO;

/* Abstract 클래스
    선언시 abstract라는 예약어가 클래스 앞에 추가된다
    클래스 내에 abstract로 선언된 메소드가 0개 이상 있어야 한다
    abstract로 선언된 메소드가 하나라도 있으면 그 클래스는 무조건 abstract로 선언되어야 한다
    abstract 클래스는 몸통이 있는 메소드가 0개 이상 있어도 상관 없으며, static or final 메소드가 있어도 된다.
 */
public abstract class MemberManagerAbstract {
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);
    public void printLog(String data){
        System.out.println("Data="+data);
    }
}
