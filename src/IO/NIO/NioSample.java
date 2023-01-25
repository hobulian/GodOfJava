package IO.NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {

    public static void main(String[] args) {
        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName = "C:\\Users\\amand\\바탕 화면\\GodOfJava\\test\\nio.txt";
        try {
            writeFile(fileName, "My 1st NIO Sample");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData);
        channel.write(buffer);
        System.out.println("파일 쓰기 성공");
        channel.close();
    }
    public void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while(buffer.hasRemaining()) {
            System.out.println((char)buffer.get());
        }
        channel.close();
    }
}
