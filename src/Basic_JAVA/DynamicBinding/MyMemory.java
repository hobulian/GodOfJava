package Basic_JAVA.DynamicBinding;

public abstract class MyMemory{
    protected int []arr;
    protected int pos;

    public MyMemory() {
        this(5); // 배열 길이가 미정일 경우 5
    }
    public MyMemory(int num){
        arr = new int[num]; // 배열 생성
        pos = 0; // 배열 위치
    }

    public void push(int data) {
        arr[pos++] = data; // arr[0]에 값을 넣고 위치가 1 증가
    }

    public abstract int pop(); // 추상메소드
}

