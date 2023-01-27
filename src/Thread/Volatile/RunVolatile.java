package Thread.Volatile;

/* Volatile
    변수를 CPU 캐시가 아닌 Main Memory에 저장하겠다는 선언
    변수를 Read Write할 때마다 주 메모리에 접근
    하나의 Thread가 Write하고 나머지 Thread가 읽는 상황에 변수 값이 일치하지 않게 될 수 있음
    혹은 변수의 값이 최신의 값으로 읽혀야 하는 경우
    https://nesoy.github.io/articles/2018-06/Java-volatile
 */
public class RunVolatile {
    public static void main(String[] args) {
        RunVolatile sample = new RunVolatile();
        sample.runVolatileSample();
    }

    private void runVolatileSample() {
        VolatileSample sample = new VolatileSample();
        sample.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sleep Ended !!!");
        sample.setDouble(-1);
        System.out.println("Set value is completed !!!");
    }
}
