package 다중인터페이스;
// 상속과 다중인터페이스 함께 사용 하기
public class MultiInterfaceMain {
    public static void main(String[] args) {
         SportsCar ferrari = new SportsCar(false, 18, false,
                 250, "Red", "2022", false);
         ferrari.viewInfo();
    }
}
