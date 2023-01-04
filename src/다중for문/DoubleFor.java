package 다중for문;

import java.util.Scanner;

// 별 찍기 응용
// 정수 입력 받기 : 4
// *
// * *
// * * *
// * * * *
public class DoubleFor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수 입력 받기 : ");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
