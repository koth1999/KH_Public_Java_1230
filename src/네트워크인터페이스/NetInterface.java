package 네트워크인터페이스;

import java.util.Scanner;

public class NetInterface {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 [1]WiFi, [2]5G, [3]LTE : ");
        int net = sc.nextInt();
        switch(net){
            case 1 :
                adapter = new WiFi("KT Telecom");
                adapter.connect();
                break;
            case 2 :
                adapter = new FiveG("SK Telecom");
                adapter.connect();
                break;
            case 3 :
                adapter = new LTE("LG U+");
                adapter.connect();
                break;
            default :
                System.out.println("네트워크 선택이 잘 못 되었습니다.");
        }
    }
}
