package Thread.Runnable_Thread;

public class ThreadSample extends Thread { // 이중 상속 문제로 사용 불가능할 때가 있음.
    public void run() {
        System.out.println("This is ThreadSample's run()");
    }
}
