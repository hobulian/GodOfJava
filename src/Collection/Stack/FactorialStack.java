package Collection.Stack;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class FactorialStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("팩토리얼 값 입력 : ");
                int num = sc.nextInt();
                if(num == 0) {
                    System.out.println("종료");
                    break;
                }
                System.out.println("while문 "+num+"! : "+fact(num));
                System.out.println("for문 "+num+"! : "+fact(num));
            } catch (InputMismatchException e) {
                System.err.println("숫자만 입력 가능"); // printstacktrace는 너무 지저분해저서 생략
                sc.nextLine();
                // 버퍼의 입력값을 지워주지않으면 무한반복하게 됨
                // sc에는 입력값이 남아 계속해서 exception이 발생하고 while문으로 인해 무한반복
                continue;
            }
        }
    }

    public static int fact(int num) {
        Stack<Integer> fact = new Stack<Integer>();
        if(num <= 0 ) {
            return 0;
        }
        int result = 1;
        do{
            if(num >= 1) {
                fact.push(num);
                num--; // stack 영역에 값을 쌓음
            } else if(!fact.isEmpty()) {
                result *= fact.pop(); // stack영역 값을 출력과 동시에 삭제하며 *연산 진행
            }
        }
        while(!fact.isEmpty()); // stack이 비어있게되면 함수 종료
        return result;
    }

    public static int fact2(int num) {
        Stack<Integer> fact = new Stack<Integer>();
        if(num <= 0 ) {
            return 0;
        }
        int result = 1;
        for(int i = num; i > 0 ; i--) {
            fact.push(num);
            num--;
        }
        for(int i = 0; i<fact.size(); i++) {
            result *= fact.pop();
        }

        return result;
    }

}
