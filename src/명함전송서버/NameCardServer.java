package 명함전송서버;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// 1. 명함 정보를 담을 클래스 생성 (이름, 전화번호, 이메일, 소속)
// 2. List 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept()에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 명함 전송 여부를 물어봄(전송 하시겠습니까? (Yes/No)
// 4. 클라이언트에서 명함을 수신하면 출력하기
public class NameCardServer {
    static List<NameCard> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        int port = 1307;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);
        while(true){
            Socket socket = serverSocket.accept();
            System.out.println("[클라이언트 : "+socket.getRemoteSocketAddress()+"연결");
            System.out.println("클라이언트로 명함을 전송 하시겠습니까?(yes/no) : ");
            String confirm = sc.next();
            if(confirm.equalsIgnoreCase("yes")) {
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(writeNameCard());
                oos.flush();
                oos.close();
                os.close();
            }
        }

    }
    static List<NameCard> writeNameCard(){
        list.add(new NameCard("우영우", "010-1234-5678", "yyy@gmail.com", "서울"));
        list.add(new NameCard("안유진", "010-0123-4567", "ayj@gmail.com", "SM"));
        list.add(new NameCard("카리나", "010-1345-4555", "karina@gamil.com", "SM"));
        list.add(new NameCard("카즈하", "010-1567-8989", "kazuha@gmail.com", "Hive"));
        list.add(new NameCard("민지", "010-9893-9859", "minji@gmail.com", "Hive"));
        list.add(new NameCard("다니엘", "010-8578-4321", "daniel@gmail.com", "Hive"));
        list.add(new NameCard("해린", "010-3445-2345", "haerin@gmail.com", "Hive"));
        list.add(new NameCard("채원", "010-5785-7787", "chaewon@gmail.com", "Hive"));
        list.add(new NameCard("혜인", "010-6787-7832", "haein@gmail.com", "Hive"));
        list.add(new NameCard("하니", "010-3421-5868", "hani@gmail.com", "Hive"));
        return list;
    }
}


