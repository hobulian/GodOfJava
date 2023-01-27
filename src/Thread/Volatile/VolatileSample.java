package Thread.Volatile;

public class VolatileSample extends Thread {
    //private volatile double instanceVar=0;
    private double instanceVar=0;

    void setDouble(double value) {
        this.instanceVar = value;
    }

    public void run() {
        try {
            while (instanceVar == 0) {
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        }
        System.out.println(instanceVar);
    }
}
