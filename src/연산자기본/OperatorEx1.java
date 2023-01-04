package 연산자기본;

import java.util.Scanner;

// 산술연산자 : +, -, *, /, %(나머지)
// 대입연산자 =: 변수에 값을 대입할 때 사용하는 이항 연산자 입니다. (방향이 오른쪽에서 왼쪽으로 진행)
// 증감연산자 : ++, --, 단항연산자, 피연산의 값을 1증가 또는 1감소 시킴
// 비교연산자 :  2개의 피연산자를 비교해서 참과 거짓을 판별하는 것
// 논리연산자 : AND(&&) 2개의 조건이 모두 참이면 참
// OR(||) 2개의 조건중 하나만 참이면 참, NOT(!) 현재의 조건을 부정
// 삼항연산자 : 항이 3개인 연산자, 조건문의 일종이며 참과 거짓만 있는 경우 사용 가능
// 문자열 결합 연산자 : +
// 연산자 우선순위
public class OperatorEx1 {
    public static void main(String[] args) {
        int val1=5, val2=5, val3=5;
        int rst1, rst2, rst3;
        rst1=val1+val2*val3; // 30
        rst2=(val1+val2)*val3; // 50
        rst3=val1+(val2++)*val3; //35
        System.out.println(rst1);
        System.out.println(rst2);
        System.out.println(rst3);
    }
}
