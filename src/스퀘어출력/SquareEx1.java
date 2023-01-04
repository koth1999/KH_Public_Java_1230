package 스퀘어출력;

import java.util.Scanner;

// 양의 정수 n을 입력받아 n*n 크기의 행렬을 출력하는 프로그램
// 행렬의 값은 1부터 시작
// n을 3으로 입력
// 1 2 3
// 4 5 6
// 7 8 9
public class SquareEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int n=sc.nextInt();


        for(int i=1; i<=n*n; i++){
            System.out.printf("%4d", i);
            if(i%n==0) System.out.println();
        }
    }
}
