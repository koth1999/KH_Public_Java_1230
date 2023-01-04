// public : 접근 제한자를 의미(public, private, protected)
// Class이름은 일반적으로 첫자가 대문자 이어야 함
// void는 메소드 수행 이후 반환 값이 없음을 의미
// main은 프로그램의 시작 위치를 의미하며 JVM에 의해서 호출 된다.
// System.out은 자바의 표준 출력 클래스이다. (print, println, printf)

public class Sample { // Sample Class
    public static void main(String[] args) {
       System.out.println(100);
       System.out.println(3.14);
       System.out.println("자바 화이팅!!!!");
       System.out.println("문자열끼리의 " + "연결도 가능합니다.");
       System.out.printf("%d %d %f\n", 3000, 6000, 9.99);
       System.out.printf("%f\n", 3.14);
    }
}
