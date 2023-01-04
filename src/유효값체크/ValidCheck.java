package 유효값체크;

import java.util.Scanner;
// while문은 먼저 조건을 확인하고 반복문을 수행
// do~while문은 먼저 수행하고 조건을 확인함
public class ValidCheck {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("나이를 입력하세요 : ");
            age=sc.nextInt();

        } while(age<=0 || age>=200);
        System.out.println("당신의 나이는 "+age+"입니다");
    }
}
