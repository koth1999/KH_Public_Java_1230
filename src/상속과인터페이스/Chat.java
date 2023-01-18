package 상속과인터페이스;

public abstract class Chat {
    Chat(){}
    public void sendMsg(){
        System.out.println("메시지를 보냅니다.");
    }
    public void rcvMsg(){
        System.out.println("메시지를 받습니다.");
    }
    abstract String testName();
}
