package Thread.Runnable_Thread;

public class NameCalcThread extends Thread {
    private int calcNumber;
    public NameCalcThread (String name, int calcNumber){
        super(name);
        this.calcNumber = calcNumber;
    }
    public void run() {
        calcNumber++;
    }
}
