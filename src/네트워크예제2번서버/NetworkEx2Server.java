package 네트워크예제2번서버;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetworkEx2Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();// 포트 바인딩을 위해서 서버소캣 생성
            // bind시 IP와 port 번호를 입력하는데 대부분의 경우 IP는 localhost로 지정하고, 멀티 IP인 경우에는 정확한 IP를 지정
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
            while(true){
                System.out.println("[연결 기다림]");
                Socket socket = serverSocket.accept(); // 클라이언트 연결 요청을 수락함(연결 요청이 있기전까지 블로킹 상태)
                InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[연결 요청을 수락함] "+isa.getHostName()); // 클라이언트 IP를 반환
            }
        } catch(Exception e){}

        if(!serverSocket.isClosed()){
            try{
                serverSocket.close();
            } catch(IOException e){}
        }
    }
}
