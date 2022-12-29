package Exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    public void throwable() {
        int[] intArray = new int[5];
        try {
            //intArray = null; // NullPointerException
            System.out.println(intArray[5]); // ArrayIndexOutOfBoundsException
        } catch(Throwable t) {
            System.out.println("====Used getMessage() method====");
            System.out.println(t.getMessage());
            System.out.println("====Used toString() method====");
            System.out.println(t.toString());
            System.out.println("====Used printStackTrace() method====");
            t.printStackTrace();
        }
    }
}
