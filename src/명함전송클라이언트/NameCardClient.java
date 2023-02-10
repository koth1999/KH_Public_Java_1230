package 명함전송클라이언트;

import 명함전송서버.NameCard;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 1307);
        System.out.println("서버 접속 성공");
        InputStream is = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        List<NameCard> nameCards = (List<NameCard>) ois.readObject();
        viewNameCards(nameCards);
    }
    static void viewNameCards(List<NameCard> nameCards){
        for(NameCard e : nameCards){
            System.out.println("===== 명함 정보 출력 =====");
            System.out.println("이름 : "+e.getName());
            System.out.println("전화번호 : "+e.getPhoneNum());
            System.out.println("이메일 : "+e.getEMail());
            System.out.println("주소 : "+e.getAddr());

        }
    }
}
