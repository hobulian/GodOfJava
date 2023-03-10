package Thread.Synchronized;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for (int i = 0; i < 5; i++) {
            runSync.runCommonCalculate();
        }
    }

    private void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate(); // 두 쓰레드가 동일한 객체를 참조해야 synchronized가 의미가 있다.
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value is "+calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
