package 최대값최소값구하기;

import java.util.Scanner;

// 정수를 입력받음 (배열의 갯수)
// 입력 받은 정수의 크기 만큼의 배열 생성
// 배열의 크기 만큼 순회하면서 임의의 정수 값 입력
// 입력 받은 배열에서 최소값과 최대값 출력
// 정수값 : 10
// 1 3 5 7 2 6 12 34 9 11
// MIN : 1
// MAX : 34
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 입력 : ");
        int number = sc.nextInt();

        int[] arr = new int[number];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            int min = arr[0];
            int max = arr[0];
            for (int i =0; i<arr.length; i++) {
                if(min>arr[i]) min=arr[i];
                if(max<arr[i]) max=arr[i];
         }
        System.out.println("최소 : "+min);
        System.out.println("최대 : "+max);
    }
}