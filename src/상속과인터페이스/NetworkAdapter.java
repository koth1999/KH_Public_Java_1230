package 상속과인터페이스;

public interface NetworkAdapter {
    public abstract void connect(); // public abstract를 표시하지 않으면 자동으로 추가됨
    default void description(){
        System.out.println("자바8에서 추가된 기능 입니다.");
    }
}

// 클래스 상속과 인터페이스 상속을 한번에 받기
class WiFi extends Chat implements NetworkAdapter{
    String company;
    String name;

    public WiFi(String company, String name){
        this.company = company;
        this.name = name;
    }
    @Override
    public void connect() {
        System.out.println(company+"WiFi에 연결 되었습니다.");
    }

    @Override
    String testName() {
        return "WiFi";
    }
    @Override
    public void sendMsg(){
        System.out.println(name+"에게 메시지를 보냅니다.");
    }
    @Override
    public void rcvMsg(){
        System.out.println(name+"으로 부터 메시지를 받습니다.");
    }
}

class FiveG extends Chat implements NetworkAdapter{
    String company;
    String name;
    public FiveG(String company, String name){
        this.company = company;
        this.name = name;
    }

    @Override
    String testName() {
        return "5G";
    }

    @Override
    public void connect() {
        System.out.println(company+"5G에 연결 되었습니다.");
    }

    @Override
    public void sendMsg(){
        System.out.println(name+"에게 메시지를 보냅니다.");
    }
    @Override
    public void rcvMsg(){
        System.out.println(name+"으로 부터 메시지를 받습니다.");
    }
}


