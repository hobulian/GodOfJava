package JAVA8.added.lambda;

public class runCommonThread {
    public static void main(String[] args) {
        //runCommonThread.runCommonThread();
        runCommonThread.runCommonThreadLambda();
    }

    private static void runCommonThread() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }

    private static void runCommonThreadLambda() {
//        new Thread(() -> {
//            System.out.println(Thread.currentThread().getName();
//        }).start();
//
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
