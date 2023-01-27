package Thread.Daemon;

import Thread.Runnable_Thread.ThreadSample;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.checkThreadProperty();
        sample.runDaemonThread();
        // 다른 실행중인 일반 쓰레드가 없다면 정지해버림. 모니터링 쓰레드에 사용.
        // 주요 쓰레드가 종료되면 관련 모니터링 쓰레드가 종료되어야 프로세스가 종료될 수 있기 때문.
    }

    private void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("thread1 id="+thread1.threadId());
        System.out.println("thread2 id="+thread2.threadId());

        System.out.println("thread1 name="+thread1.getName());
        System.out.println("thread2 name="+thread2.getName());

        System.out.println("thread1 priority="+thread1.getPriority());

        daemonThread.setDaemon(true);
        System.out.println("thread1 isDaemon="+thread1.isDaemon());
        System.out.println("daemonThread isDaemon="+daemonThread.isDaemon());
    }

    public void runCommandThread() {
        DaemonThread thread = new DaemonThread();
        thread.start();
    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }
}
