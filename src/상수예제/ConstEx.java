package 상수예제;

import java.util.Scanner;

// 상수란? 변수와 마찬가지로 데이터를 저장하기 위해 메모리 공간을 할당받는 것을 의미
// 상수는 단 한번만 값을 지정할 수 있으며 이후에는 변경 불가 상태가 됨

public class ConstEx {
    public static void main(String[] args) {
        final double taxRate; // 세율은 10%
        Scanner sc=new Scanner(System.in); // 키보드로부터 입력을 받기 위해 스캐너 객체를 생성
        System.out.print("수입을 입력 하세요 : ");
        taxRate=0.09;
        int income=sc.nextInt(); // 키보드로부터 정수값을 입력 받아서 income 변수에 대입
        System.out.println("당신이 내야 할 세금은 "+ (income*taxRate));
    }
}
