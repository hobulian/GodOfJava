package Collection.Stack;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
        sample.checkPop();
    }

    public void checkPeek() { // peek()는 데이터를 리턴한다
        Stack<Integer> intStack = new Stack<>();
        System.out.println("=== Check Peek() ===");
        for(int loop=0;loop<5;loop++){
            intStack.push(loop);
            System.out.println(intStack.peek());
        }
        System.out.println("size="+intStack.size());
        System.out.println("isEmpty = "+intStack.empty());
        // empty()와 isEmpty()의 기능은 같음. isEmpty()가 컬렉션 전부의 호환성을 위해 사용됨
    }

    public void checkPop() { // pop()는 데이터를 리턴하면서 제거한다
        Stack<Integer> intStack = new Stack<>();
        System.out.println("=== Check Pop() ===");
        for(int loop=0;loop<5;loop++){
            intStack.push(loop);
            System.out.println(intStack.pop());
        }
        System.out.println("size="+intStack.size());
        System.out.println("isEmpty = "+intStack.isEmpty());
    }
}
