package 문자열자르기;

import java.util.Scanner;

// 시간 입력 : 23:30:59 => 오후 11시 30분 59초
// 시간 입력 : 11:3:1 => 오전 11시 03분 01초

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times=sc.next();
        String[] splitTime = times.split(":"); // splitTime 문자열 배열 생성
        int hour = Integer.parseInt(splitTime[0]); // 시간에 대한 문자열을 정수로 변환
        int min = Integer.parseInt(splitTime[1]); // 분에 대한 문자열을 정수로 변환
        int sec = Integer.parseInt(splitTime[2]); // 초에 대한 문자열을 정수로 변환

        if(hour>11){
            System.out.printf("오후 %02d시 %02d분 %02d초\n", (hour-12), min, sec);
        } else{
            System.out.printf("오전 %02d시 %02d분 %02d초\n", (hour), min, sec);
        }


    }
}
