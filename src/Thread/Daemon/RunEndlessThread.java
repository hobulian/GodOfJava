package Thread.Daemon;

/*
    main() 메소드의 수행이 끝나도, thread가 종료하지 않는다면, 해당 자바 프로세스는 끝나지 않는다.
 */
public class RunEndlessThread {
    public static void main(String[] args) {
        RunEndlessThread thread = new RunEndlessThread();
        thread.endless();
    }

    private void endless() {
        EndlessThread thread = new EndlessThread();
        thread.start();
    }

   class EndlessThread extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println(System.currentTimeMillis());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
