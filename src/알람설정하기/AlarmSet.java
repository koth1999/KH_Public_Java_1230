package 알람설정하기;

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 시간과 분을 정수값으로 입력 받음
        System.out.print("시간 입력 : ");
        int hour=sc.nextInt();
        System.out.print("분 입력 : ");
        int min=sc.nextInt();

        int calc=(hour*60)+min; // 시간을 모두 분으로 일단 변환 후 계산
        if(calc<45){ // 45분을 뺀 결과가 0보다 작은 경우에 대해 고려
            calc=(24*60)+min;
        }
        calc-=45; // 분으로 변경된 값에서 45를 빼고 결과를 시간과 분으로 환산해서 결과출력
        System.out.printf("%d시%d분\n",(calc/60), (calc%60));

    }
}
