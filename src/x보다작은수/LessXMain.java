package x보다작은수;

import java.util.Scanner;

// 첫째줄에 N과 X가 주어짐
// 둘째줄에 수열 A를 이루는 정수 N개가 주어짐
// 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
// 10 5 => 배열의 갯수와 찾을 수를 연속해서 입력
// 1 10 4 9 2 3 8 5 7 6
// 결과값 : 1 4 2 3
public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            if(A<x){
                System.out.print(A+" ");
            }
        }
    }
}
