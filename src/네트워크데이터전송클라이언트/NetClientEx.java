package 네트워크데이터전송클라이언트;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetClientEx {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        System.out.println("[연결 요청]");
        socket.connect(new InetSocketAddress("localhost", 5001));
        System.out.println("[연결 성공]");

        byte[] bytes = null;
        String message = null;

        OutputStream os = socket.getOutputStream(); // 소켓의 출력 스트림 얻기, OutputStream(바이트 기반의 스트림)
        message = "Hello Server";
        bytes = message.getBytes("UTF-8");
        os.write(bytes);
        os.flush();
        System.out.println("[데이터 보내기 성공]");

        InputStream is = socket.getInputStream(); // 소켓의 입력 스트림, InputStream(바이트 기반의 입력 스트림의 최상위 클래스)
        bytes = new byte[100];
        int readByteCount = is.read(bytes);
        message = new String(bytes, 0, readByteCount, "UTF-8");
        System.out.println("[데이터 받기 성공] : "+message);
        os.close();
        is.close();
        socket.close();
    }
}
