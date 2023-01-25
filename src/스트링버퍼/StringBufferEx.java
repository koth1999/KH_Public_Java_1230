package 스트링버퍼;
import java.lang.*; // 자동으로 컴파일러에 의해서 추가 됨 (기본 패키지)
// StringBuffer : 문자열을 추가하거나 변경 할 때 사용되는 자료형 (동기화 처리가 있다)
// StringBuilder : 문자열을 추가하거나 변경 할 때 사용되는 자료형 (동기화 처리가 없다)
// String : 문자열을 + 연산자로 추가하면 매번 더할 때 마다 새로운 문자열이 생성됨
// append(), delete(), insert(), substring()
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuffer 객체 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("to Java");
        sb.append(" ");
        sb.append("JavaScript");
        //sb.delete(1,3); // 1번 인덱스에서 3번 인덱스 미만까지
        sb.insert(0,"test"); // 해당 인덱스에 문자열을 추가 함
        System.out.println(sb);
        System.out.println(sb.substring(0,4)); // 시작 인덱스에서 종료 인덱스 미만까지의 문자열을 잘라냄

    }
}
