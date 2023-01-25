package Socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    private void startServer() {
        ServerSocket server = null;
        Socket client = null;
        try {
            server = new ServerSocket(9999);
            while(true) {
                System.out.println("서버: Waiting for reuqest...");
                client = server.accept();
                System.out.println("서버: Accepted");
                InputStream is = client.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(is));
                String data = null;
                StringBuilder recievedData = new StringBuilder();
                while((data = in.readLine())!=null) {
                    recievedData.append(data);
                }
                System.out.println("수신된 데이터:"+recievedData);
                in.close();
                is.close();
                client.close();
                if(recievedData!=null && "EXIT".equals(recievedData.toString())) {
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
