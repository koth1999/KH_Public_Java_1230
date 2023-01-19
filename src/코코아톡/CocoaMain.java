package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        CocoaTok cocoaTok = new CocoaTok("카리나");
        cocoaTok.writeMsg("오늘 춥죠?");
        NetAdapter adapter; // 인터페이스를 참조 변수로 선언
        Scanner sc = new Scanner(System.in);
        System.out.print("네트워크 [1]WiFi [2]5G : ");
        int sel = sc.nextInt();
        if(sel==1) adapter = new WiFi();
        else adapter = new FiveG();
        cocoaTok.send(adapter);

      }
}

