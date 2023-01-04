package 성적에대한등급;

import java.util.Scanner;

// 성적을 입력받음
// 입력 받은 성적이 0~100사이가 아니면 "성적을 잘못 입력 하였습니다." 라고 출력
// 90이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D, 나머지는 F로 출력
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int grade=sc.nextInt();

        if(grade>=0 && grade<=100){
            if(grade>=90) System.out.println("A");
            else if(grade>=80) System.out.println("B");
            else if(grade>=70) System.out.println("C");
            else if(grade>=60) System.out.println("D");
            else System.out.println("F");

        } else{
            System.out.println("성적을 잘못 입력하였습니다.");
        }



    }
}
