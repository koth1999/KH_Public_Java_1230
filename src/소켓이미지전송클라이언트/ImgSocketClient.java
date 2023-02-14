package 소켓이미지전송클라이언트;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

// 서버에서 파일이 전송되었습니다. 저장할 경로를 지정 하세요.
// 해당 경로로 파일 저장
public class ImgSocketClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Socket socket = new Socket("localhost", 1900);
            System.out.println("서버 접속 성공");
            System.out.print("저장할 위치를 지정 하세요(경로/파일명) : ");
            String path = sc.nextLine();
            Thread imgTh = new ImgClientTh(socket, path);
            imgTh.start();
        } catch(Exception e){}
    }
}

class ImgClientTh extends Thread {
    Socket socket;
    String path;
    public ImgClientTh(Socket socket, String path){
        this.socket = socket;
        this.path = path;
    }
    @Override
    public void run(){
        try{
            InputStream is = socket.getInputStream();
            FileOutputStream fos = new FileOutputStream(path);
            int len;
            byte[] buffer = new byte[1024];
            while((len = is.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }
            System.out.println("이미지 전송 완료!!!");
            fos.flush();
            fos.close();
        } catch(IOException e){}
    }
}