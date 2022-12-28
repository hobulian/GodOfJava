package Basic_JAVA.DynamicBinding;

public class MyStack extends MyMemory {

    @Override
    public int pop() {
        return arr[--pos]; // 값을 1 빼고 리턴
    }
}
