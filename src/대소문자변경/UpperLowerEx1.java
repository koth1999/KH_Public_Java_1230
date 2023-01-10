package 대소문자변경;

import java.util.Scanner;
// 영문자만 입력 받음
// 입력받은 문자열에서 대문자는 소문자로 소문자는 대문자로 변경 하기
// toUpperCase => TOuPPERcASE
// 힌트 1 : 문자열에서 특정 문자를 추출하는 방법은 charAt(index)
// 힌트 2 : 문자는 내부적으로 정수값으로 간주되어 사용 된다.
// 힌트 3 : 값을 출력 할때 정수값이 아닌 문자로 표현하기 위해서는 형변환이 필요
public class UpperLowerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        char ch; // 문자열에 인덱스에 해당하는 문자를 담을 변수

        for(int i=0; i<str.length(); i++){
            ch=str.charAt(i); // 문자열에 해당 인덱스 문자 추출
            if(ch<'a') System.out.print((char)(ch+('a' - 'A')));
            else  System.out.print((char)(ch-('a' - 'A')));
        }
    }
}
