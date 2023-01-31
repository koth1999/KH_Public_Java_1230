package 클래스정렬2;

import java.util.TreeSet;

// Comparator : 정렬을 구현하는 사용자 인터페이스, compare() 메소드를 구현해줘야 함
// 2개의 객체를 전달 받아 비교해줌
public class ClassSortEx2 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<>(new AscendingComp()); // TreeSet 객체 생성 시 검색을 담당하는 객체를 만듬
        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("수박", 10000));
        ts.add(new Fruit("딸기", 15000));

        for(Fruit e : ts){
            System.out.println("이름 : "+e.name);
            System.out.println("가격 : "+e.price);

        }
    }
}
