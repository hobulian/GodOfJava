package Exception;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable();
    }

    public void checkVariable(){
        int[] intArray = null; // 2. 이를 방지하기 위해서 try앞에 catch 문장에서도 사용될 변수를 미리 선언해야한다.
        try {
            intArray = new int[5]; // 3. 예외 발생 전에 길이 5짜리 정수 배열이 설정되어서
            //int[] intArray = new int[5]; // 1. 안에 선언될 경우 중괄호 내의 지역변수로 취급
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length); // 4. 여기서 문제없이 배열의 길이가 5로 반환된다.
        }
        System.out.println("This code must run.");
    }
}
