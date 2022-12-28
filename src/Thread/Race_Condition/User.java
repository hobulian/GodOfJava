package Thread.Race_Condition;

/* Race Condition
멀티 스레드 프로그래밍에서 발생하는 문제로 여러 스레드가 다수의 리소스를 경쟁적으로 업데이트하면
예측 불가능한 데이터 문제가 발생하는 것을 말함.
 */
public class User implements Runnable{
    private BankAccount account;
    public User(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this + "가 사용중입니다"); //현재 사용중인 User의 인스턴스 주소 출력
            account.deposit(10000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this + "가 사용중입니다"); //현재 사용중인 User의 인스턴스 주소 출력
            //두 출력문 사이에서 언제 다른 User의 인스턴스가 연산 권한을 가져갔는지 알기 위해 try-catch
            account.withdraw(1000);
            System.out.println(account.getBalance());
        }
    }
}