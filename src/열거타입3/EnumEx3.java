package 열거타입3;
// values() 메소드 : 해당 열거체의 모든 상수를 저장한 배열을 생성 후 반환
enum Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}
public class EnumEx3 {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for(Rainbow e : arr) System.out.print(e+" ");
    }
}
