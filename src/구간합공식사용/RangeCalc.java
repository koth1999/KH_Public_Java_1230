package 구간합공식사용;

import java.util.Scanner;

public class RangeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        int[] sumArr = new int[n+1];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            if(i==0) sumArr[i]=arr[i];
            else sumArr[i] = sumArr[i-1]+arr[i];
        }
        int left = 0, right = 0;
        while(x!=0){
            left = sc.nextInt();
            right = sc.nextInt();
            if(left!=1) System.out.println(sumArr[right-1]-sumArr[left-2]);
            else System.out.println(sumArr[right-1]-0);
            x--;
        }
    }
}
