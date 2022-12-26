package Basic_JAVA;

public class PSVM {

//    public static void main(String[] args) {
//        //public(Access Specifier) + static(Keyword) + void(return type) + main(Method name) +
//        //String args[](parameter, Array of String type)
//        System.out.println("자바 메인 메소드 테스트");
//    }

//    public static void maintest(String[] args) {
//        System.out.println("자바 메인 메소드 테스트");
//        /*Error: Main method not found in class Basic_JAVA.PSVM, please define the main method as:
//        public static void main(String[] args)*/
//    }

       /*C나 C++ 에서는 OS를 통해 연산하기 때매 int값을 리턴. 이 int값은 exit code 혹은 exit 상태를 의미함.
        이 값에 따라서 왜 프로그램이 종료되었는지를 알 수 있다. 0이면 성공적인 종료. 다른 값은 오류나 비정상적 종료를 의미.
        예를 들어서, 종료 코드 1의 경우 여러가지 오류, 예를 들자면 0으로 나누기 같은 오류를 의미한다.
        부모 프로세스는 자식 프로세스의 종료를 대기하게 된다. 자식의 종료 상태가 판명되면 자식의 프로세스를 프로세스 테이블에서
        제거한 뒤에, 프로세스에 할당된 자원을 "Free"한다. C나 C++ 프로그램들은 OS의 프로세스이기 때문에, 이렇게 종료 코드나 상태 반환을
        명시적 혹은 묵시적으로라도 해주는 것이 의무적이다.
        자바는 이와 다른데, 자바의 경우 프로그램이 JVM의 메인 스레드로 실행된다. 자바 프로그램은 따라서 OS 프로세스에 직접 종속되지 않는다.
        자바 프로그램과 OS는 직접적인 상호작용이 없다. 자바 프로그램에 자원이 직접 할당되지 않으며 자바 프로그램이 Process Table에 어떠한
        공간도 차지하지 않는다. 따라서 자바 프로그램은 Exit Status를 반환해야할 대상 자체가 없다 볼 수 있다. 따라서 자바 프로그램은
        int value등을 통하여 Exit Status를 반환하도록 짜여지지 않는다.
        그러나 JVM은 OS의 프로세스이기 때문에, JVM은 특정한 exit status를 갖고 종료될 수 있다. 이러한 경우에는
        Java.lang.Runtime.exit(int status) 혹은 System.exit(int status)가 필요하다.
        */

//    public static int main(String[] args) {
//        System.out.println("자바 메인 메소드 테스트");
//        return 0;
//        /*
//        Error: Main method must return a value of type void in class Basic_JAVA.PSVM, please
//        define the main method as:
//        public static void main(String[] args)*/
//    }

    /* Main 메소드 없이 자바를 실행할 수 있는가?
    그렇다. static 블록을 활용하면 자바를 메인 메소드 없이 실행할 수 있다.
    스태틱 블록은 클래스가 ClassLoader에 의해 메모리(스택)에 로드될 때 단 한번 실행되는 구문의 그룹이다.
    이 것은 static 시작 블록으로 알려져있다. */

    class StaticBlock {
        static
        {
            System.out.println(
                    "This class can be executed without main");
            System.exit(0);
        }
    }
}
