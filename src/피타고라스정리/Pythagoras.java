package 피타고라스정리;

import java.util.Arrays;
import java.util.Scanner;



public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        while(true){
            for(int i=0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            if(arr[0]+arr[1]+arr[2]==0) break;
            else if((arr[2]*arr[2]) == (arr[0]*arr[0])+(arr[1]*arr[1])){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
}
