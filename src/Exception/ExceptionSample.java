package Exception;

public class ExceptionSample {

    public static void main(String[] args) {
        ExceptionSample sample = new ExceptionSample();
        sample.arrayOutOfBounds();
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]); // 1. 5는 배열의 범위 밖의 위치기 때문에 OutOfBoundsException 발생
            System.out.println("This code should run.");
        } catch (Exception e) {
            System.out.println("Exception 발생"); // 2. Exception이 발생하자마자 catch구문으로 점프
        }
        System.out.println("This code must run."); // 3. try-catch문 밖의 구문은 catch 이후 실행
        // 1에서 예외가 발생하지 않으면, catch문 내의 구문은 실행되지 않고 3으로 넘어옴
    }
}
