package Basic_JAVA.DynamicBinding;

/*동적 바인딩
메소드의 body가 런타임에 메소드 call과 묶일 경우 그 것을 동적 바인딩 혹은 late binding이라 함

Overriding은 동적 바인딩을 설명하는 좋은 예시
규칙
0. 상속 관계에 있어야 함
1. 상속 받은 클래스간 Overriding을 하려면 메소드 이름이 같아야 함
2. 메소드의 파라미터 또한 같아야 함

제한
1. 부모 클래스의 private메소드는 오버라이드 할 수 ㅇ벗다
2. Final 메소드도 마찬가지
3. Static 메소드도 마찬가지

 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class DynamicBinding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyStack ms = new MyStack();
        MyQueue mq = new MyQueue();
        MyMemory mm = null;

        do {
            System.out.println("1.Stack 2.Queue 3.Exit =>");
            int num = sc.nextInt();
            //동적 바인딩 선택
            if (num == 1) {
                mm = ms; // MyMemory = MyStack
            } else if (num == 2)
                mm = mq; // MyMemory = MyQueue
            else
                break;

            //활용
            while(true){
                System.out.println("1.push 2.pop 3.back =>");
                int num1 = sc.nextInt();
                //동적 바인딩 선택
                if (num1 == 1) {
                    mm.push(sc.nextInt()); // 입력 값을 Stack or Queue에 넣음
                } else if (num1 == 2)
                    System.out.println(mm.pop());
                else
                    break;
            }
        } while (true);
    }
}
