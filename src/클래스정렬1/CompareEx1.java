package 클래스정렬1;

import java.util.TreeSet;

// Comparable/Comparator : 클래스에 대한 정렬을 구현할 수 있도록 해주는 인터페이스
// Comparable : 자신의 객체와 매개변수로 입력받은 객체를 비교함
public class CompareEx1 {
    public static void main(String[] args) {
        TreeSet<CarEx> ts = new TreeSet<>();
        ts.add(new CarEx("Santafe", 2022, "White"));
        ts.add(new CarEx("Sonata", 2014, "Gray"));
        ts.add(new CarEx("Grandeur", 1999, "White"));
        ts.add(new CarEx("Sorento", 2022, "Red"));
        for(CarEx e : ts){
            System.out.println("차종 : "+e.modelName);
            System.out.println("연식 : "+e.modelYear);
            System.out.println("색상 : "+e.color);
            System.out.println("----------------------");
        }
    }
}
