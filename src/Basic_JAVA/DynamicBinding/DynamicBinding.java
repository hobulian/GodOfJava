package Basic_JAVA.DynamicBinding;


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
