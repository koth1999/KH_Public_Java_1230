package 스트림예제8번;

import java.util.ArrayList;
import java.util.List;



// 스트림에서 제공하는 메소드를 이용해 조건문과 반복문 없이 일관된 방식으로 처리
public class StreamEx8 {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("안유진", 21, 1000));
        customerList.add(new TravelCustomer("유나", 21, 2000));
        customerList.add(new TravelCustomer("지수", 25, 1500));
        customerList.add(new TravelCustomer("민지", 18, 1000));
        System.out.println("==== 고객 명단 출력 ====");
        customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));

        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("총 여행 비용 :"+total);

        System.out.println("===20세 이상 명단 출력===");
        customerList.stream()
                .filter(c->c.getAge()>=20)
                .map(c->c.getName())
                .sorted()
                .forEach(s->System.out.println(s));
    }
}

class TravelCustomer {
    private String name;
    private int age;
    private int price;

    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}