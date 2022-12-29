package Exception;

public class CustomExceptionSample {
    public static void main(String[] args) {
        CustomExceptionSample sample = new CustomExceptionSample();
        try {
            sample.throwCustomException(13);
        } catch(CustomException c) {
            c.printStackTrace();
        }
    }

    public void throwCustomException(int num) throws CustomException{
        if (num > 12) {
            throw new CustomException("Number is > 12");
        }
    }
}
