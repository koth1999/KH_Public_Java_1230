package 해시맵커피;

public class MenuInfo {
    String name; // 메뉴 이름
    int price; // 메뉴 가격
    String group; // 메뉴 카테고리
    String desc; // 메뉴에 대한 설명

    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }
}

//enum MenuName{
//    AMERICANO, LATTE, ESPRESSO, COLDBREW, MOCA
//}
