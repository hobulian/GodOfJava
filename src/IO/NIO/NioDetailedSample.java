package IO.NIO;

import java.nio.IntBuffer;

public class NioDetailedSample {

    public static void main(String[] args) {
        NioDetailedSample sample = new NioDetailedSample();
        sample.checkBuffer();
        sample.checkBufferedStatus();
    }

    private void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for(int loop = 0;loop<100;loop++) {
                buffer.put(loop);
            }
            System.out.println("Capacity: "+buffer.capacity());
            System.out.println("Limit: "+buffer.limit());
            System.out.println("Position: "+buffer.position());
            buffer.flip();
            /*
                rewind()와 비슷하지만, rewind는 한계 값을 변경하지 않음.
                rewind()는 mark()와 같이 사용하여 mark()로 특정 위치를 표시한 뒤 다시 읽을 필요가 있을 떄 사용
             */
            System.out.println("Buffer Flipped!");
            System.out.println("Capacity: "+buffer.capacity());
            System.out.println("Limit: "+buffer.limit());
            System.out.println("Position: "+buffer.position());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkBufferedStatus() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            buffer.get();
            printBufferStatus("get", buffer);
            buffer.mark();
            printBufferStatus("mark", buffer);
            buffer.get();
            printBufferStatus("get", buffer);
            buffer.reset();
            printBufferStatus("reset", buffer);
            buffer.rewind();
            printBufferStatus("rewind", buffer);
            buffer.clear();
            printBufferStatus("clear", buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printBufferStatus(String job, IntBuffer buffer) {
        System.out.println("Buffer "+job+" !!!");
        System.out.format("Buffer position = %d remaining = %d limit =%d\n",
                buffer.position(), buffer.remaining(), buffer.limit());
    }
}
