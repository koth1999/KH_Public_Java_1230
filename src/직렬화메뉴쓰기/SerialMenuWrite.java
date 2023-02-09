package 직렬화메뉴쓰기;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SerialMenuWrite {
    static Map<String, CoffeeMenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        menuWrite();
        selectMenu();
    }
    static void menuWrite(){
        map.put("Americano", new CoffeeMenuInfo("Americano", 2500, "Coffee", "일반 커피"));
        map.put("Espresso", new CoffeeMenuInfo("Espresso", 2500, "Coffee", "진한 커피"));
        map.put("Latte", new CoffeeMenuInfo("Latte", 4500, "Coffee", "우유가 들어 있어요."));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("메뉴를 선택 하세요 : ");
            System.out.print("[1]메뉴 보기, [2]메뉴 추가, [3]종료 : ");
            int menu = sc.nextInt();
            switch(menu){
                case 1 :
                    System.out.println("===== 메뉴 보기 =====");
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : "+map.get(e).getName());
                        System.out.println("가격 : "+map.get(e).getPrice());
                        System.out.println("분류 : "+map.get(e).getGroup());
                        System.out.println("설명 : "+map.get(e).getDesc());
                        System.out.println("-------------------------");

                    }
                    break;
                case 2 :
                    System.out.print("추가 할 메뉴를 입력하세요 : ");
                    String key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    } else {
                        System.out.print("가격 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 : ");
                        String grp = sc.next();
                        System.out.println("설명 : ");
                        String desc = sc.nextLine();
                        map.put(key, new CoffeeMenuInfo(key, price, grp, desc));
                    }
                    break;
                case 3 :
                    System.out.println("메뉴를 종료합니다. 내용을 저장 합니다.");
                    FileOutputStream fos = new FileOutputStream("D:/직렬화파일/커피메뉴직렬화.txt");
                    ObjectOutputStream oos = new ObjectOutputStream((fos));
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    return;
            }
        }
    }
}
