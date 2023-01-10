package 문자열반전;
// abcdefg => gfedcba
// 입력받은 문자열을 역순으로 출력하기

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        int index = str.length();

        while(index>0){
            index--; // 인덱스는 문자열 길이 -1
            System.out.print(str.charAt(index));
        }
    }
}
