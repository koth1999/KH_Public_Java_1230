package 평균은넘겠지;
// [문제]
// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
// 5 => 총 테스트 케이스
// 5 50 50 70 80 100 => 각 테스트에서 대한 학생 수, 그리고 각 학생의 점수
// 7 100 95 90 60 70 60 50
// 3 70 90 80
// 3 70 90 81
// 9 100 99 98 97 96 95 94 93 91

import java.util.Scanner;
// 40.000%
// 57.143%
// 33.333%
// 66.667%
// 55.556%
public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // 테스트 케이스 입력 받기
        double[] rst = new double[testCnt];

        for(int i=0; i<rst.length; i++){
            rst[i] = overRate();
        }

        for(double e : rst){
            System.out.printf("%.3f%%\n", e);
        }
    }
    // 각 케이스에 대한 학생수와 그리고 각각의 성별을 입력받음
    // 입력받은 성적에 대한 평균 구하기(먼저 총점을 구해야함)
    // 평균을 넘는 학생 수 구하기(소수점 이하 3자리 변환해서 반환)
    static double overRate(){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 각 케이스에 대한 학생 수
        int[] score = new int[cnt];
        int total = 0; // 총점을 구하기 위한 변수
        int overCnt = 0; // 평균이 넘는 학생의 수

        for(int i=0; i<score.length; i++){
            score[i] = sc.nextInt();
            total+=score[i]; // 입력받은 학생 수 만큼 입력 받은 성적을 누적해 총점을 구함
        }
        double aver = (double)total/cnt;
        for(int e : score){ // e값은 개별 학생의 성적
            if(e>aver) overCnt++; // 평균을 넘는 학생 수 구하기
        }
        return (double)overCnt/cnt*100; // 백분율로 변경하기 위해 100을 곱함
    }
}

