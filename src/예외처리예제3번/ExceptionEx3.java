package 예외처리예제3번;

import java.util.Scanner;

// ArithmeticException : 나눗셈에서 값을 0으로 나누면 발생
public class ExceptionEx3 {
    public static void main(String[] args) {

        int rst = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int c = sc.nextInt();
            try {
                rst = a / c;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력 하세요.");
                continue;
            }
            System.out.println("결과 : "+rst);
            break;
        }
    }
}
