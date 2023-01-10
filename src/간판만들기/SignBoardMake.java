package 간판만들기;

import java.util.Scanner;

// 임의의 숫자를 입력받음 : 120
// 120에 대한 차지하는 공간을 계산
// 0은 4칸, 1은 2칸, 그외의 숫자는 3칸
// 120 => 1+2+1+3+1+4+1=13
// 5611 => 1+3+1+3+1+2+1+2+1=15
// 100 => 1+2+1+4+1+4+1=14
// 0이 입력되기 전까지는 반복수행해야함

public class SignBoardMake {
    public static void main(String[] args) {
        int[] numSize ={4,2,3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        String number=""; // 문자열을 입력 받기 위한 변수
        int sum=0; // 입력된 숫자에 대한 총 자릿수
        while(true){
            number = sc.next();
            if(number.equals("0")) break;
            for(int i=0; i<number.length(); i++){
                sum+=numSize[number.charAt(i)-'0']+1; // 각 숫자의 뒤의 여백
            }
            System.out.println(sum+1); // 숫자 맨앞의 여백을 계산하기 위해서
            sum=0;
        }

    }
}
