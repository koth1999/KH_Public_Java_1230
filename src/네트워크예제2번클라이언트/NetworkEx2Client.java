package 네트워크예제2번클라이언트;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetworkEx2Client {
    public static void main(String[] args) {
        Socket socket = null;
        try{
            socket = new Socket(); // 소켓 생성
            System.out.println("[연결 요청]");
            socket.connect(new InetSocketAddress("localhost", 5001)); // 서버에 연결 요청
            System.out.println("[연결 성공]");
        } catch(Exception e) {}

        if(!socket.isClosed()){
            try{
                socket.close();
            } catch(IOException e){}
        }
    }
}
