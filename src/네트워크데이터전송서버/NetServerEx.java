package 네트워크데이터전송서버;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetServerEx {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 5001));
        while(true){
            System.out.println("[연결 기다림]");
            Socket socket = serverSocket.accept();
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[연결 수락 함]"+isa.getHostName());

            byte[] bytes = null;
            String message = null;

            OutputStream os = socket.getOutputStream();
            message = "안녕하세요. 클라이언트님";
            bytes = message.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[데이터 보내기 성공]");

            InputStream is = socket.getInputStream(); // 소켓으로부터 입력 받기(바이트 단위)
            bytes = new byte[100];
            int readByteCnt = is.read(bytes);
            message = new String(bytes, 0, readByteCnt, "UTF-8");
            System.out.println("[데이터 받기 성공] : "+message);

            os.close();
            is.close();
            socket.close();
        }
    }
}
