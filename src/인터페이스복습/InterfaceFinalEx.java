package 인터페이스복습;

import java.util.Scanner;

// 인터페이스에 포함된 메소드는 기본적으로 추상 메소드이다. (구현부가 없는 것이 특징)
// 구현부가 없기 때문에 인터페이스의 메소드를 상속받은 클래스는 반드시 해당 메소드를 구현헤야함
// 인터페이스는 다중 상속 지원을 위해서 사용.
public class InterfaceFinalEx {
    public static void main(String[] args) {
        NetAdapter adapter;
        CocoaTak cocoaTak = new CocoaTak("최치열");
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]WiFi, [2]5G : ");
        int sel = sc.nextInt();
        if(sel==1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTak.writeMsg("수학 수업 잘 되나요?");
        cocoaTak.connect(adapter);
        cocoaTak.send(adapter);
    }
}

class CocoaTak {
    private String to;
    private String msg;
    public CocoaTak(String name){
        to = name; // 상대방 이름
    }
    public void writeMsg(String msg){
        this.msg = to + " : " + msg;
    }
    public void connect(NetAdapter adapter){
        adapter.connect();
    }
    public void send(NetAdapter adapter){
        adapter.send(msg);
    }
}

interface NetAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi에 연결이 성공 했습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> "+msg);
    }
}

class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G에 연결이 성공 했습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> "+msg);
    }
}
