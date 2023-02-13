package 소켓명함다중전송서버;

import 명함전송서버.NameCard;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 이름, 전화번호, 회사명, 이메일 포함된 10개의 명함 정보 생성 후 다른 컴퓨터로 전송하기
// 연결된 클라이언트의 개수에 상관 없이 모든 클라이언트에게 전송하기
public class MultiSerialEx2 {
    static List<NameCard> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // IP : 192.168.10.245
        int port = 8990;
        ServerSocket serverSocket = new ServerSocket(port);
        Scanner sc = new Scanner(System.in);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "연결");
            System.out.print("클라이언트로 명함을 전송 하시겠습니까?(yes / no) :  ");
            String confirm = sc.next();
            if (confirm.equalsIgnoreCase("yes")) {
                Thread nameTh = new NameServerTh(socket);
                nameTh.start();
            }
        }
    }
        static List<NameCard> writeNameCard () {
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




class NameServerTh extends Thread{
    static ArrayList<Socket> sockets = new ArrayList<>();
    Socket socket;
    public NameServerTh(Socket socket){
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run(){
        try{
            for(int i= 0; i < sockets.size(); i++){
                OutputStream os = sockets.get(i).getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                oos.writeObject(MultiSerialEx2.writeNameCard()); // 직렬화를 위해 객체를 생성
                oos.flush();
                oos.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress()+"에게 전송 완료");
            }
        } catch(IOException e){}
    }
}
