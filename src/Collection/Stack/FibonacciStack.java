package Collection.Stack;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class FibonacciStack {
    public static void main(String[] args) {
        FibonacciStack sample = new FibonacciStack();

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("수열 크기 입력 : ");
                int num = sc.nextInt();
                if (num == 0) {
                    System.out.println("종료");
                    break;
                } else if (num < 1) {
                    throw new InputMismatchException("0 이하의 정수 입력됨");
                }
                Stack<Integer> baseStack = new Stack<>();
                baseStack.push(0);
                sample.fibonacci(baseStack, num);
            } catch (InputMismatchException e) {
                System.err.println("1 이상의 정수를 입력하세요");
            }
        }
    }

    public void fibonacci(Stack<Integer> stack, int loop) {
        if (loop == 1) {

        } else {

        }
    }
    public void fibonacciCalculate(Stack<Integer> stack) {

    }
    /* public void printStack(Stack<Integer> stack) {
        for (int i = 0; i < stack.size(); i++) {
            if (i == 0) {
                System.out.print(n + "의 크기를 갖는 피보나치 수열 [");
            }

            System.out.print(array.get(i));

            if (i < array.size() - 1) {
                System.out.print(", ");
            } else{
                System.out.println("]");
            }
        }
    }
    */
}
