package 반복문기본;

import java.util.Scanner;

public class WhileBasic {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int number=sc.nextInt();
        for(int i=1; i<=number; i++){
            sum+=i;

        }
        System.out.println("입력 받은 정수의 합은 : "+sum+"입니다.");
    }
}
