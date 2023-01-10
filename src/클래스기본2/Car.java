package 클래스기본2;

public class Car { // 클래스 이름은 대문자로 시작
    static String manufacture; // 클래스 필드
    private String productName; // 인스턴스 필드
    String color; // 인스턴스 필드
    int maxSpeed; // 인스턴스 필드
    // 생성자는 클래스 이름과 동일하고, 반환타입이 없다. void도 없다
    // 생성자는 클래스가 객체로 만들어 질 때 호출되고, 생성자를 만들지 않으면 보이지 않는 생성자가 호출
    // 생성자는 여러개 만들어서 필요에 따라 적절한 생성자를 호출할 수 있다.(생성자 오버로딩)
    // 생성자의 매개변수는 클래스를 객체로 만드는 위치에서 전달한다.
    // 생성자의 목적은 클래스가 객체로 만들어 질때 해당 인스턴스 필드를 초기화 하는 것이 주 목적이다.
    Car(){
        productName = "이름없음";
        color = "색상도 없음";
        maxSpeed = 0;
    }
    Car(String name, String color, int speed){
        productName = name;
        this.color = color; // 매개변수로 전달된 변수와 인스턴스 필드의 이름이 같으면 this 사용
        maxSpeed = speed;
    }
    // 세터 메소드
    void setName(String name){
        productName = name;
    }
    void setColor(String color){
        this.color=color;
    }
    void viewCar(){
        System.out.println("이름 : "+productName);
        System.out.println("색상 : "+color);
        System.out.println("속도 : "+maxSpeed);
    }
}
