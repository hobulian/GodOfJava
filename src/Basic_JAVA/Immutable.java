package Basic_JAVA;

/** Immuatable
    생성 이후 수정 불가능
    이미 존재하는 객체가 있더라도 새 객체를 생성하여 재할당
    값을 변경할 수 있는 메소드 제공 X
    Getter & Setter X
    thread safe(병렬처리 시 값 보장)
    Legacy classes, Wrapper classes, String class 등..
 */
public class Immutable {
        public static void main(String[] args) {
            String str = "abc";
            System.out.println(str);
            System.out.println(System.identityHashCode(str));

            str += "def";
            System.out.println(str);
            System.out.println(System.identityHashCode(str));
        }
}
