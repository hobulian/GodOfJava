package Thread.ThreadState;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
        sample.checkJoin(); // thread가 종료하지 않은 상태에서 interrupt가 실행되어서 예외 발생
    }

    private void checkThreadState1() {
        SleepThread thread = new SleepThread(2000);
        try {
            System.out.println("thread state =" + thread.getState());
            thread.start();
            System.out.println("thread state(after start)=" + thread.getState());

            thread.sleep(1000);
            System.out.println("thread state(after 1s)=" + thread.getState());

            thread.join(); // join, 쓰레드가 중지할 때까지 대기
            thread.interrupt(); // 수행중인 쓰레드에 중지 요청
            System.out.println("thread state(after join)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread thread = new SleepThread(2000);
        try {
            thread.start();
            thread.join(500);
            thread.interrupt();
            System.out.println("thread state(after jjoin)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
