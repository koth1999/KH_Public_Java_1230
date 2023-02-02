package 게임만들기;

import java.util.Scanner;

// 상속과 인터페이스 적용
// 쓰레드 구현
public class GameExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("강력한 체력과 물리 공격력의 전사 이름을 정하세요 : ");
        String waName = sc.next();
        System.out.print("궁극의 마법 능력을 지닌 마법사 이름을 정하세요 : ");
        String wiName = sc.next();

        Character warrior = new Character(waName, 8, 2, 0.8, 0.5, 40, 500);
        Character wizard = new Character(wiName, 2, 28, 0.5, 0.9, 100, 250);
        GameThA gameA = new GameThA(warrior, wizard);
        GameThB gameB = new GameThB(warrior, wizard);
        gameA.start();
        gameB.start();
    }
}
