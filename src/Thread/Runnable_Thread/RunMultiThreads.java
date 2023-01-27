package Thread.Runnable_Thread;


public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads threads = new RunMultiThreads();
        threads.runMultiThread();
    }

    private void runMultiThread() {
        RunnableSample[]runnable = new RunnableSample[5];
        ThreadSample []thread = new ThreadSample[5];
        for (int i = 0; i < 5; i++) {
            runnable[i] = new RunnableSample();
            thread[i] = new ThreadSample();

            new Thread(runnable[i]).start();
            thread[i].start();
        }
        System.out.println("RunMultiThreads.runMultiThread() method is ended.");
    }

    class ThreadSample extends Thread { // 이중 상속 문제로 사용 불가능할 때가 있음.
        public void run() {
            System.out.println("This is ThreadSample's run()");
        }
    }
}
