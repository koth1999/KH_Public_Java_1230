package 열거형연습;
// 타입 체크를 할 수 있다라는게 큰 장점
public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("정경수", DevType.EMBEDDED, Career.SENIOR, Gender.MALE);
        developer.devInfo();

    }
}
