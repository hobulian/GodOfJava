package Exception;

public class FinallySample {
    public static void main(String[] args) {
    FinallySample sample = new FinallySample();
    sample.checkVariable();
}

    public void checkVariable(){
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally { // 예외 발생과 상관 없이 실행된다. 코드의 중복을 피하기 위해서 반드시 필요하다. 26장 IO 관련에서 자세히 봄
            System.out.println("Here is Finally.");
        }
        System.out.println("This code must run.");
    }
}
