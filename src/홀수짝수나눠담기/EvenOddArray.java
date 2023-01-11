package 홀수짝수나눠담기;

import java.util.Scanner;

public class EvenOddArray {
    int[] inputArray = new int[7];
    int[] evenArray = new int[7];
    int[] oddArray = new int[7];
    int evenIdx = 0; // 짝수에 대한 인덱스 계산
    int oddIdx = 0; // 홀수에 대한 인덱스 계산


    void inputValue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        for(int i=0; i<inputArray.length; i++){
            inputArray[i] = sc.nextInt();
        }
    }

    void separateValue(){
        for(int e : inputArray){
            if(e % 2 == 0) evenArray[evenIdx++] = e;
            else oddArray[oddIdx++] = e;
        }

    }

    void displayValue(){
        System.out.print("홀수 : ");
        for(int i=0; i<oddIdx; i++){
            System.out.print(oddArray[i]+" ");
        }
        System.out.println();

        System.out.print("짝수 : ");
        for(int i=0; i<evenIdx; i++){
            System.out.print(evenArray[i]+" ");
        }
    }
}
