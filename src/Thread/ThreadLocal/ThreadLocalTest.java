package Thread.ThreadLocal;

public class ThreadLocalTest {

    // 스레드 클래스
    static class ThreadWithLocal extends Thread {
        private static final ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> "defaultName");
        private final String name;

        public ThreadWithLocal(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.printf("%s Started,  ThreadLocal: %s%n", name, threadLocal.get());
            // 스레드 로컬에 값(현재 스레드 이름) 저장
            threadLocal.set(name);
            System.out.printf("%s Finished, ThreadLocal: %s%n", name, threadLocal.get());
        }
    }

    public void runTest() {
        for (int threadCount = 1; threadCount <= 5; threadCount++) {
            final ThreadWithLocal thread = new ThreadWithLocal("thread-" + threadCount);
            thread.start();
        }
    }

    public static void main(String[] args) {
        new ThreadLocalTest().runTest();
    }
}
