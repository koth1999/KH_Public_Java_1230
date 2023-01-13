package 오버로딩응용;
// 메소드 오버로딩에 객체에 대한 참조 변수 사용으로 다형성 구현
public class OverloadingApply {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        buyer.buy(tv);
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.viewInfo();
    }
}
