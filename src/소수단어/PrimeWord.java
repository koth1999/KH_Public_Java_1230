package 소수단어;

import java.util.Scanner;

public class PrimeWord {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 알파벳을 더해서 총 숫자의 합 구하기
        boolean isPrime = true; // 소수 여부를 판별하는 Bool Type 변수 (기본값을 소수)
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)>='a') sum += word.charAt(i)-'a'+1; // 소문자 구간은 1~26까지의 각 알파벳 숫자 더하기
            else sum += word.charAt(i)-'A'+1; // 대문자 구간
        }
        System.out.println(sum); // 각 영어 알파벳을 더해서 총 숫자의 합 구하기

        // 소수 여부 판별
        for(int i = 2; i<sum; i++){ // 1과 2를 제외한 범위
            if(sum%i==0) isPrime = false;
        }
        if(isPrime) System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
