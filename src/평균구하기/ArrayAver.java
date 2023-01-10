package 평균구하기;

import java.util.Scanner;

// 5명의 학생이 시험을 치는데 시험점수가 40점미만이면 보충수업으로 듣는 조건으로 점수를 40점으로 수정
// 모든 학생이 40점 미만인 경우 보충 수업을 듣기로함
// 모든 학생의 성적에 대한 평균을 구하기
public class ArrayAver {
    public static void main(String[] args) {
        int[] score = new int[5]; // 5명의 성적을 입력 받기 위한 배열
        int total=0; // 학생 성적을 누적해 총점을 구하기 위한 변수 생성
        Scanner sc = new Scanner(System.in); // 성적을 입력 받기 위한 스캐너 생성

        for(int i=0; i<score.length; i++){
            score[i]=sc.nextInt(); // 배열에 성적을 받기
            if(score[i]<40) score[i]=40; // 입력 받은 성적이 40미만인 경우 40으로 조정
            total+=score[i];
        }
        System.out.printf("%.2f\n", (double)total/5);

    }
}
