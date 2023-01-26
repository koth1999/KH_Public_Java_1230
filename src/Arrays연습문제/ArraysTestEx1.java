package Arrays연습문제;

import java.util.Arrays;
import java.util.Scanner;

// 1000개의 배열을 생성하고, 각 배열에 1000미만의 임의의 수 생성(중복값 제거)
// 찾을 임의의 수 입력
// 배열을 오름 차순 정렬하고 난 후 찾을 수를 이분 검색을 이용해서 값 찾기
// 값을 찾으면 해당값의 위치를 출력(인덱스가 아님)
public class ArraysTestEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        int[] arr = new int[1000];
        int tmp, index=0;

        boolean isExist = false;

        while(true){
            tmp=(int)((Math.random()*1001));

            for(int i=0; i<arr.length; i++){
                if(arr[i]==tmp) isExist = true;
            }

            if(isExist==false) arr[index++]=tmp;
            if(index==1000) break;
            isExist=false;

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // 배열을 문자열로 찍어 줌
        int rst = Arrays.binarySearch(arr, key+1); // 해당 위치를 반환 (인덱스가 넘어옴)
        if(rst>=0) System.out.println("결과 : "+rst);
        else System.out.println("해당 수를 찾지 못했습니다.");
        }
   }

