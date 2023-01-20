package x보다작은수2;

import java.util.Scanner;

public class LessX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열의 갯수
        int X = sc.nextInt(); // 주어진 수

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); // 주어진 N만큼 받기
            if(arr[i]<X){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
