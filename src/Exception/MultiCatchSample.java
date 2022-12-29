package Exception;

public class MultiCatchSample {
    public static void main(String[] args) {
    MultiCatchSample sample = new MultiCatchSample();
    sample.checkVariable();
    sample.checkVariableError();
}

    public void checkVariable(){
        System.out.println("checkVariable");
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
    }

    public void checkVariableError(){
        System.out.println("checkVariableError");
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } /*catch (ArrayIndexOutOfBoundsException e) { // 위의 Exception(부모 클래스)에서 이미 잡혔기 때문에 오류 발생
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
        } */
    }
}
