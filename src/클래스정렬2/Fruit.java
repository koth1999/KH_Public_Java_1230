package 클래스정렬2;

import java.util.Comparator;

public class Fruit {
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

class DescendingComp implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price < o2.price) return 1; // 내림차순 정렬
        return -1;
    }
}

class AscendingComp implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price > o2.price) return 1; // 오름차순 정렬
        return -1;
    }
}