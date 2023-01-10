package StringKMP;

import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
public class StringKMP {
    public static void main(String[] args) {
        // 첫 번째 방법 : split() 메소드 이용
        // 두 번째 방법 : charAt() 메소드를 이용해 대문자만 추출
        // 세 번째 방법 : 0번째 문자를 출력하고, '-'이 후 문자를 출력하는 방법
        // 네 번째 방법 : 문자 배열로 변경 후 출력 하기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.next();

        // "Knuth-Morris-Pratt" =>'K', 'n', 'u', 't', '-'
        char [] chName = name.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e<='Z') System.out.print(e);
        }
    }
}