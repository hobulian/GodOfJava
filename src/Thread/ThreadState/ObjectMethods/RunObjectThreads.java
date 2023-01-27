package Thread.ThreadState.ObjectMethods;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        //sample.checkThreadState2();
        sample.checkThreadState3();
    }

    private void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread state =" + thread.getState());
            thread.start();
            System.out.println("thread state(after start)=" + thread.getState());

            thread.sleep(100);
            System.out.println("thread state(after 0.1s)=" + thread.getState());
            synchronized (monitor) {
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());

            thread.join();
            System.out.println("thread2 state(after join)=" + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try {
            System.out.println("thread state =" + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(after start)=" + thread.getState());

            thread.sleep(100);
            System.out.println("thread state(after 0.1s)=" + thread.getState());
            synchronized (monitor) {
                //monitor.notify(); // 이 경우에는 먼저 대기하고 있던 thread만 대기 해제됨 따라서 모든 쓰레드를 대기 해제하려면
                monitor.notifyAll(); // 를 사용.
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify)=" + thread.getState());

            thread.join();
            System.out.println("thread state(after join)=" + thread.getState());
            thread2.join();
            System.out.println("thread state(after join)=" + thread2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
