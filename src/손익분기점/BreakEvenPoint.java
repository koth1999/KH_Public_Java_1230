package 손익분기점;
// 손익분기점 : 초 수입이 총 비용보다 많아져 이익이 발생하는 지점
// A(고정비용), B(가변비용), C(판매가격)
// 이익이 나는 지점의 생산 갯수 출력
// 손익분기점이 존재하지 않으면 -1
import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt();
        int valCost = sc.nextInt();
        int selPrice = sc.nextInt();
        int cnt = 0;

        if(valCost>=selPrice){
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost / (selPrice-valCost)+1));

    }
}
