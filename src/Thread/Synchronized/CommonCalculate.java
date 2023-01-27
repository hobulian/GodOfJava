package Thread.Synchronized;

public class CommonCalculate {
    private int amount;
    Object amountLock = new Object();
    private int interest;
    Object interestLock = new Object();
    public CommonCalculate() {
        amount = 0;
    }
    public void plus(int value) { // public synchronized void plus(int value)도 가능 그러나,
        synchronized(amountLock) { // 동기화 연산이 필요한 부분을 선언하는 것이 효율적
            amount += value;
        }
    }
    public synchronized void minus(int value) {
        synchronized(this) {
            amount -= value;
        }
    }
    public void addInterest(int value) {
        synchronized(interestLock) {
            interest += value;
        }
    }
    public int getAmount() {
        return amount;
    }
}
