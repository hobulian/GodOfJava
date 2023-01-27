package Thread.ThreadGroup;
/*  Thread Group
    용도가 다른 쓰레드들 간에 그룹을 생성해 정리, 관리하는 용도.
    기본적으로 Tree구조를 지님. 그룹 아래 그룹을 포함할 수가 있다.
 */
import Thread.ThreadState.SleepThread;

public class RunGroupThreads {
    public static void main(String[] args) {
        RunGroupThreads sample = new RunGroupThreads();
        sample.groupThread();
    }

    private void groupThread() {
        try {
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);

            ThreadGroup group = new ThreadGroup("Group1");
            Thread thread1 = new Thread(group, sleep1);
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Group name="+group.getName());
            int activeCount=group.activeCount();
            System.out.println("Active Count="+activeCount);
            group.list();

            Thread[] tempThreadList = new Thread[activeCount];
            int result = group.enumerate(tempThreadList);
            System.out.println("Enumerate result="+result);
            for(Thread thread:tempThreadList) {
                System.out.println(thread);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
