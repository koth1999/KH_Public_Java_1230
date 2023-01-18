package 리모컨인터페이스;
import java.util.Scanner;
public class RemoConInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품을 선택 하세요. [1]TV [2]Audio : ");
        int sel = sc.nextInt();
        RemoteControl remoCon;
        if(sel==1){
            remoCon = new Television();
            remoCon.turnOn();
            remoCon.setVolume(20);
            remoCon.getInfo();
        } else{
            remoCon = new Audio();
            remoCon.turnOn();
            remoCon.setVolume(120);
            remoCon.getInfo();
        }

    }
}
