package Thread.DeadLock;

/* DeadLock
멀티 스레드 프로그래밍에서 동기화를 통해 락을 획득하여 동일 자원을 여러 곳에서 함부러 사용하지 못하도록 함(Race Condition 해결)
그러나, 두 개의 스레드에서 서로가 갖고 있는 락이 해제되기를 기다리는 상태가 발생할 수 있으며 이를 DeadLock이라 함
교착 상태가 되면 어떤 작업도 실행되지 못하고 스레드 간에 서로의 락이 해제되기를 바라는 무한정 대기 상태가 지속됨
 */

/* DeadLock 발생 조건
1. MutEX : 한 자원에 대하여 여러 스레드가 동시에 접근 불가
2. Hold and Wait : 자원을 갖고 있는 상태에서 다른 쓰레드가 사용하고 있는 자원 반납을 기다림
3. Non Preemtive : 다른 쓰레드의 자원을 실행 중간에 강제로 가져올 수 없음
4. Circle Wait : 각 쓰레드가 순환적으로 다음 쓰레드가 요구하는 자원을 갖고 있음
 */
public class Main {
    public static Object object1 = new Object();
    public static Object object2 = new Object();

    public static void main(String[] args) {
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();

        thread1.start();
        thread2.start();
    }
    //3. 비선점 : 스레드 우선순위의 기본 값이 NORM_PRIORITY로 동일하게 설정됨
    private static class FirstThread extends Thread{
        @Override
        public void run(){
            synchronized (object1){ // 1. MutEX
                System.out.println("First Thread has object1's lock");

                try{
                    Thread.sleep(10);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("First Thread wants to have object2's lock. So wait...");
                //4. 환형대기 : 서로의 object의 락을 대기함.

                synchronized (object2) {
                    System.out.println("First Thread has object2's lock too");
                    //2.점유와 대기 : object1에 대한 lock을 갖고 있으면서도 object2에 대한 lock을 요구.
                }
            } // Release
        }
    }

    private static class SecondThread extends Thread{
        @Override
        public void run(){
            synchronized (object2){ //1. MutEX
                System.out.println("Second Thread has object2's lock");

                try{
                    Thread.sleep(10);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Second Thread wants to have object1's lock. So wait...");
                //4. 환형대기 : 서로의 object의 락을 대기함.

                synchronized (object1) {
                    System.out.println("Second Thread has object1's lock too");
                    //2. 점유와 대기 : object2에 대한 lock을 갖고 있으면서도 object1에 대한 lock을 요구.
                }
            } // Release
        }
    }
}
