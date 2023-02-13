package 다중채팅클라이언트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MultiRCV extends Thread {
    Socket socket;

    public MultiRCV(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run(){
        InputStream is = null; // 바이너리 입력
        InputStreamReader isr = null; // 바이너리를 문자로 변환하는 스트림
        BufferedReader reader = null; // 성능 향상 보조 스트림
        String str = null;

        try{
            while(true){
                is = socket.getInputStream(); // 소켓으로부터 바이너리 입력
                isr = new InputStreamReader(is); // 바이너리를 문자로 변환
                reader = new BufferedReader(isr); // 성능 향상을 위한 보조 스트림
                if((str = reader.readLine()) != null){
                    System.out.println(str);
                }
            }
        } catch(IOException e){}
    }
}
