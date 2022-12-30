package Basic_JAVA;

/** Muatable
    생성 이후 수정 가능
    이미 존재하는 객체에 재할당(값 변경)
    값을 변경할 수 있는 메소드 제공
    Getter & Setter
    thread safe하지 않을 수 있음(병렬처리 시 값 보장 X)
    StringBuffer(동기화됨), StringBuilder, java.util.Date, List, ArrayList 등..
 */
public class Mutable {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("abc");
        System.out.println(stringbuilder);
        System.out.println(System.identityHashCode(stringbuilder));

        stringbuilder.append("def");
        System.out.println(stringbuilder);
        System.out.println(System.identityHashCode(stringbuilder));
    }
}
