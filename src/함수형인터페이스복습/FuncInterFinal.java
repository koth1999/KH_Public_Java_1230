package 함수형인터페이스복습;
// 함수형 인터페이스 : 자바에서는 메소드가 단독으로 존재할수가 없어 함수형 프로그래밍을 하기 위해서는
// 함수형 인터페이스가 필요함
// 람다식을 구현하기 위해서 함수형 인터페이스를 만들고 인터페이스에 람다식으로 구현할 인터페이스를 선언
@FunctionalInterface
interface Calculator {
    void sum(int a, int b);
}

public class FuncInterFinal {
    public static void main(String[] args) {
        Calculator mc = (a,b) -> {
          int rst = a+b;
          System.out.print(rst);
        };
        mc.sum(3,4);
    }
}
