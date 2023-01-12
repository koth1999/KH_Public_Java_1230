package 클래스상속;

public class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
}
// Animal로 부터 Dog가 상속을 받아서 클래스 생성
class Dog extends Animal{
    void sleep(){
        System.out.println(name + "잠을 잡니다.");
    }
}

class HouseDog extends Dog{
    @Override
    void sleep(){ // 오버라이딩 관계가 만들어짐
        System.out.println(name +"오랜 동안 잠을 잡니다.");

    }
    void sleep(int hour){ // 오버로딩
        System.out.println(name+"가 "+hour+"시간"+" 동안 잠을 잡니다.");

    }
}
