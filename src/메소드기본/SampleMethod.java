package 메소드기본;

public class SampleMethod {
    int sum(int a, int b){ // 매개변수가 있고 반환타입도 있는 메소드, 인스턴스 메소드
        return a+b;
    }
    void say(){ // 매개변수도 없고 반환값도 없는 메소드
        System.out.println("안녕하세요. 만나서 반가워요");
    }
    String strSay(){
        return "안녕하세요. 만나서 반가워요";
    }
}
