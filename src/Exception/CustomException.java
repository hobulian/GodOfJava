package Exception;

public class CustomException extends RuntimeException{ //반드시 Throwable 클래스의 직계 자손 클래스를 상속받아야 한다
    public CustomException() {
        super();
    }
    public CustomException(String message){
        super(message);
    }
}
