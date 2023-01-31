package 큐연습;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// FIFO : First-In-First-Out, LinkedList를 활용하여, LinkedList의 모든 메소드를 사용하는 것이 아니고,
// Queue 구현에 필요한 기능만 제공
// add(E e) : 큐의 맨뒤에 요소를 추가
// peek() : 큐의 매 앞에 있는 요소를 반환
// remove() : 맨 앞의 요소를 반환
// boolean offer(Object o) : 객체를 삽입(맨 뒤에)
// Object poll() : 객체를 꺼냄(맨 앞에서)
// Object element() : 삭제 없이 요소를 읽어옴
public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        msgQueue.offer(new Message("SMS", "유나"));
        msgQueue.offer(new Message("Mail", "정국"));
        msgQueue.offer(new Message("KaKao", "카리나"));

        while(!msgQueue.isEmpty()){
            Message msg = msgQueue.poll();
            switch(msg.command){
                case "Mail":
                    System.out.println(msg.to+"에게 메일을 보냅니다.");
                    break;
                case "SMS":
                    System.out.println(msg.to+"에게 문자를 보냅니다.");
                    break;
                case "KaKao":
                    System.out.println(msg.to+"에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}

class Message {
    String command;
    String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}