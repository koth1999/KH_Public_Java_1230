package 암호화만들기복습;
// 평문을 입력 :
// 암호키 :
// 결과문구 :

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncryptFinalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine();
        System.out.print("암호문 : ");
        String encrypt = sc.next(); // 암호문구는 계속 반복(평문 길이만큼 계속 반복)
        char[] enc = encrypt.toCharArray(); // 문자열을 문자배열로 변경
        char value = 0; // List에 담기전에 계산되는 값
        List<Character> vig = new ArrayList<>();

        for(int i=0; i<normal.length(); i++){
            if (normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char)(normal.charAt(i)-(enc[i%encrypt.length()]-'a')-1);
                if(value<'a') value+=26;
                vig.add(value);
            }
        }
        for(Character e : vig) System.out.print(e);
    }
}
