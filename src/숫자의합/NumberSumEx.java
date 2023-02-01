package 숫자의합;

import java.util.Scanner;

// 문제 : N개의 숫자가 공백없이 쓰여 있다. 이 숫자를 모두 합해서 출력
// 54321 => 15
// 700000000 => 7
// 5678 => 26
// 0000 -> 종료조건
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        while (true) {
            int sum = 0;
            num = sc.next();
            if (num.equals("0000")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }
            System.out.println(sum);
        }
    }
}