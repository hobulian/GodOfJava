package Exception;

public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample sample = new ThrowSample();
        /**
        java: unreported exception java.lang.Exception; must be caught or declared to be thrown
        메소드에 throws Exception을 쓸 때는 반드시 throws로 선언된 메소드를 호출한 메소드에서 try-catch로 호출 부분을 감싸야 한다.
         */
        try {
            sample.throwException(13);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    public void throwException(int num) {
        try {
            if (num > 12) {
                throw new Exception("Number is over than 12");
                // throw한 예외 클래스는 catch블록이나 throws 선언에 포함되어야 컴파일이 가능하다
            }
            System.out.println("Number is " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */

    public void throwException(int num) throws Exception{ // 두 개 이상의 예외를 throws할 때는 콤마로 구분하여 적는다
        /**
        java: unreported exception java.lang.Exception; must be caught or declared to be thrown
        메소드에 throws Exception을 쓸 때는 반드시 throws로 선언된 메소드를 호출한 메소드에서 try-catch로 호출 부분을 감싸야 한다.
         */
        if (num > 12) {
                throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + num);
    }
}
