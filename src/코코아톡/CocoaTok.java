package 코코아톡;

public class CocoaTok {
    private String to; // 상대방 이름
    private String msg; // 전달할 메시지

    public CocoaTok(String name){
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to+" : "+msg; // 전달할 메시지 앞에 전달 받은 사람 추가
    }
    public void send(NetAdapter na){
        na.send(msg);
    }
}
