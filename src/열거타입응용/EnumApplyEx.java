package 열거타입응용;

import java.util.Scanner;

public class EnumApplyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jobs jobs = null;
        System.out.print("직업을 입력 하세요 : ");
        int in = sc.nextInt();
        switch(in){
            case 1 :
                jobs = Jobs.Student; break;
            case 2 :
                jobs = Jobs.Worker; break;
            case 3 :
                jobs = Jobs.HouseWife; break;
            case 4 :
                jobs = Jobs.None; break;
        }
        System.out.println(jobs);
    }
}
