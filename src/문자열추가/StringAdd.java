package 문자열추가;

import java.util.Scanner;

// 2개의 문자열을 입력 받고, 정수 n값을 입력받음
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// ulkorea
// 첫번째 문자열의 뒤 부분의 n개의 문자를 두번째 문자열 앞에 끼워 넣는 코드작성
// substring 사용해야하고, substring을 이용해서 문자열로 추출할때 사용되는 인덱스를 미리 구해야된다.
public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String str1 = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String str2 = sc.next();
        System.out.print("정수 입력 : ");
        int n=sc.nextInt();
        int pos = str1.length()-n;
        String sub = str1.substring(pos);
        System.out.println(sub+str2);

    }
}
