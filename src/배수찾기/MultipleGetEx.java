package 배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 첫번째 배수에 대한 기본값을 입력(주어진 값)
// 연속으로 값 입력 받기 (ArrayList 입력 받은 값을 저장)
// 0이면 종료
// 입력 받기를 종료 한 이후 List 내에 있는 값이 주어진 값의 배수인지 아닌지 확인해서 출력
// 예를 들어 주어진 값이 3이면....
// 99 is a multiple of 3.
// 7 is Not a multiple of 3.
public class MultipleGetEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어진 기본값
        int tmp; // 키보드의 값을 입력 받기 위한 변수

        while(true){
            tmp=sc.nextInt();
            if(tmp==0) break;
            list.add(tmp);
        }
        for(Integer e : list){
            if(e % n == 0) System.out.println(e+" is a multiple of "+n+".");
            else System.out.println(e+" is Not a multiple of "+n+".");
        }
    }
}
