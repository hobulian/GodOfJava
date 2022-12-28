package Basic_JAVA.DynamicBinding;

public class MyQueue extends MyMemory {
    private int front;

    public MyQueue() {
        front = 0;
    }

    @Override
    public int pop() {
        return arr[front++]; // arr[0] 출력 후 1증가
    }
}
